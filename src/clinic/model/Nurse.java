package src.clinic.model;

import java.util.Date;

import src.clinic.model.enums.DegreeOfAid;
import src.clinic.model.enums.RoomType;

public class Nurse extends Staff {
    private boolean isTriageNurse;
    private RoomType assignment;

    public Nurse() {}

    public Nurse(String name, String staffId, String phoneNumber, String emailAddress, String department,
            DegreeOfAid degreeOfAid, Date dateOfBirth, boolean isTriageNurse, RoomType assignment) {
        super(name, staffId, phoneNumber, emailAddress, department, degreeOfAid, dateOfBirth, 15);
        this.isTriageNurse = isTriageNurse;
        this.assignment = assignment;
    }

    public boolean isTriageNurse() { return isTriageNurse; }
    public RoomType getAssignment() { return assignment; }


    public void setTriageNurse(boolean isTriageNurse) {
        this.isTriageNurse = isTriageNurse;
    }

    public void setAssignment(RoomType assignment) {
        this.assignment = assignment;
    }

}