package src.model;

import java.util.Date;

public abstract class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Date dateOfBirth;
    
    Person(){}
    Person(String name, String Id, String phoneNumber, String emailAddress, Date dateOfBirth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmailAddress() { return emailAddress; }


    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Name cannot be blank.");
        }
        this.name = name.trim();
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.matches("[0-9]{10}")) {
            System.out.println("Invalid Phone Number");
        }
        this.phoneNumber = phoneNumber;
    }

    

    public void setEmailAddress(String emailAddress) {
        if (emailAddress == null || !emailAddress.endsWith("@gmail.com")) {
            System.out.println("Invalid email adress.");
        }
        this.emailAddress = emailAddress;
    }
}
