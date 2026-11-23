package  clinic.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Patient extends Person {

    //Attributes 
    private String patientId;
    private int severityScore;
    private String classification; 
    private LocalDateTime arrivalTime;

    //constructor
    public Patient (String name, String id, String phoneNumber, String emailAddress, 
                    Date dateOfBirth, String patientId, int severityScore, String classification) {
     super(name, id, phoneNumber, emailAddress, dateOfBirth);

     this.patientId = patientId;
     this.severityScore = severityScore; 
     this.classification = classification; 
     this.arrivalTime = LocalDateTime.now();
    }

    public String getPatientId() { return patientId; }
    public int getSeverityScore() { return severityScore; }
    public String getClassification() { return classification; }
    public LocalDateTime getArrivalTime() { return arrivalTime; }


    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    public void setSeverityScore(int severityScore) {
        this.severityScore = severityScore;
    }
    public void setClassification(String classification) {
        this.classification = classification;
    }
    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}