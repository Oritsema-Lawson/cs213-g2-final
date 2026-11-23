package clinic.service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import clinic.model.Patient;

public class TriageQueue {

    private PriorityQueue<Patient> queue;
    //How long one has to wait before their score goes up by 1
    private static final long MINUTES_PER_WAIT = 5;

    public TriageQueue(TriageAssessor assessor) {
        this.queue = new PriorityQueue<>(
                (p1, p2) -> {
                    LocalDateTime now = LocalDateTime.now();
                    int s1 = calculateAgedScore(assessor, p1, now);
                    int s2 = calculateAgedScore(assessor, p2, now);

                    if (s1 != s2) {
                        return Integer.compare(s2, s1);
                    }

                    return p1.getArrivalTime().compareTo(p2.getArrivalTime());
                }
        );

    }

    // Increase score based on waiting time, prevents infinite waits
    private int calculateAgedScore(TriageAssessor assessor, Patient p, LocalDateTime now) {
        int score = getScore(assessor, p);
        if (p.getArrivalTime() == null || now.isBefore(p.getArrivalTime())) {
            return score;
        }

        long waitingTime = Duration.between(p.getArrivalTime(), now).toMinutes();
        int waitingBonus = (int) (waitingTime / MINUTES_PER_WAIT);

        return score + waitingBonus;
    }

    //Safely pull score
    private int getScore(TriageAssessor assessor, Patient p) {
        if (p == null || p.getAssessment() == null) {
            return 0;
        }

        try {
            return assessor.calculateTotalScore(p.getAssessment());
        } catch (Exception e) {
            return 0;
        }
    }

    public void refreshQueue() {
        List<Patient> temp = new ArrayList(queue);
        queue.clear();
        queue.addAll(temp);
    }

    public void enqueue(Patient p) {
        if (p == null) {
            return;
        }

        refreshQueue();
        queue.offer(p);
    }

    public Patient dequeue(Patient p) {
        refreshQueue();
        return queue.poll();
    }

    public Patient peek() {
        refreshQueue();
        return queue.peek();
    }

    public boolean remove(Patient p) {
        return queue.remove(p);
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public List<Patient> getOrderedSnapshot() {
        refreshQueue();
        List<Patient> temp = new ArrayList<>(queue);
        temp.sort(queue.comparator());
        return temp;
    }
}
