package src.model;

import java.util.Date;

public abstract class Staff extends Person {
    private String staffId;
    private String department;
    private boolean available; 
    
    public Staff(){}
    
    public Staff(String name, String staffId, String phoneNumber, String emailAddress, String department, Date dateOfBirth) {
        super(name, staffId, phoneNumber, emailAddress, dateOfBirth);
        this.staffId = staffId;
        this.department = department;
        this.available = true;
    }

    public String getStaffId() { return staffId; }
    public String getDepartment() { return department; }
    public boolean isAvailable() { return available; }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}