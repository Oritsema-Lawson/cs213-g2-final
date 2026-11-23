package  clinic.model;

import java.util.Date;

import  clinic.model.enums.DegreeOfAid;

public class Specialist extends Staff {
    private String specialization;
    private boolean requiresReferral;

    public Specialist(String name, String staffId, String phoneNumber, String emailAddress, String department,
            DegreeOfAid degreeOfAid, Date dateOfBirth, String specialization,
            boolean requiresReferral) {
        super(name, staffId, phoneNumber, emailAddress, department, degreeOfAid, dateOfBirth, 45);

        this.specialization = specialization;
        this.requiresReferral = requiresReferral;
    }

    public Specialist() { }

    public String getSpecialization() { return specialization; }
    public boolean requiresReferral() { return requiresReferral; }   

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    public void setRequiresReferral(boolean requiresReferral) {
        this.requiresReferral = requiresReferral;
    }   
}