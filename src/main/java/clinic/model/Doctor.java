package clinic.model;

import java.util.Date;

import  clinic.model.enums.DegreeOfAid;

public class Doctor extends Staff {
    private Room office;
    private String licenseNumber;
    private boolean canAuthorizeTransfer;

    public Doctor(){}

    public Doctor(String name, String staffId, String phoneNumber, String emailAddress, String department,
            Date dateOfBirth, Room office, String licenseNumber,
            boolean canAuthorizeTransfer) {
        super(name, staffId, phoneNumber, emailAddress, department, DegreeOfAid.ADVANCED_CARE, dateOfBirth, 30);
        this.office = office;
        this.licenseNumber = licenseNumber;
        this.canAuthorizeTransfer = canAuthorizeTransfer;
    }


    public Room getOffice() {
        return office;
    }
    public void setOffice(Room office) {
        this.office = office;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    public boolean isCanAuthorizeTransfer() {
        return canAuthorizeTransfer;
    }
    public void setCanAuthorizeTransfer(boolean canAuthorizeTransfer) {
        this.canAuthorizeTransfer = canAuthorizeTransfer;
    }
}