package src.clinic.exceptions;

public class SchedulingClashException extends Exception {
    SchedulingClashException(String m) {
        super(m);
    }
}