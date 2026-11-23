package  clinic.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Patient extends Person {

    //Attributes 
    private String patientId;
    private TriageAssessment assessment;
    private String classification; 
    private LocalDateTime arrivalTime;

    //constructor
    public Patient (String name, String id, String phoneNumber, String emailAddress, 
                    Date dateOfBirth, String patientId, TriageAssessment assessment, String classification) {
     super(name, id, phoneNumber, emailAddress, dateOfBirth);

     this.patientId = patientId;
     this.assessment = assessment; 
     this.classification = classification; 
     this.arrivalTime = LocalDateTime.now();
    }

    public String getPatientId() { return patientId; }
    public TriageAssessment getAssessment() { return assessment; }
    public String getClassification() { return classification; }
    public LocalDateTime getArrivalTime() { return arrivalTime; }


    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    public void setAssessment(TriageAssessment assessment) {
        this.assessment = assessment;
    }
    public void setClassification(String classification) {
        this.classification = classification;
    }
    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}