package  clinic.model;

import java.util.Date;
import  clinic.model.enums.DegreeOfAid;

public abstract class Staff extends Person {
    private String staffId;
    private String department;
    private boolean available; 
    private int consultTime;
    private DegreeOfAid degreeOfAid;
    
    public Staff(){}
    
    public Staff(String name, String staffId, String phoneNumber, String emailAddress, String department, DegreeOfAid degreeOfAid, Date dateOfBirth, int consultTime) {
        super(name, staffId, phoneNumber, emailAddress, dateOfBirth);
        this.staffId = staffId;
        this.department = department;
        this.degreeOfAid = degreeOfAid;
        this.available = true;
        this.consultTime = consultTime;
    }

    public String getStaffId() { return staffId; }
    public String getDepartment() { return department; }
    public DegreeOfAid getDegreeOfAid() { return degreeOfAid; }
    public boolean isAvailable() { return available; }
    public int getConsultTime() { return consultTime; }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean canProvideAid(DegreeOfAid degreeOfAid) {
        return this.degreeOfAid.ordinal() >= degreeOfAid.ordinal() ? true : false;
    }

    public void setConsultTime(int consultTime) {
        this.consultTime = consultTime;
    }
}