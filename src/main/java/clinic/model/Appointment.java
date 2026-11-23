package  clinic.model;
import java.time.LocalDateTime;

import  clinic.model.enums.AppointmentStatus;

public class Appointment{
    private String appointmentId;
    private Patient patient;
    private Staff assignedStaff;
    private Room assignedRoom;
    private LocalDateTime startTime; 
    private LocalDateTime endTime;
    private AppointmentStatus status;

    public Appointment(String appointmentId, Patient patient, Staff assignedStaff, Room assignedRoom,
            LocalDateTime startTime, LocalDateTime endTime, AppointmentStatus status) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.assignedStaff = assignedStaff;
        this.assignedRoom = assignedRoom;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public String getAppointmentId() { return appointmentId; }
    public Patient getPatient() { return patient; }
    public Staff getAssignedStaff() { return assignedStaff; }
    public Room getAssignedRoom() { return assignedRoom; }
    public LocalDateTime getStartTime() { return startTime; }
    public LocalDateTime getEndTime() { return endTime; }
    public AppointmentStatus getStatus() { return status; }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public void setAssignedStaff(Staff assignedStaff) {
        this.assignedStaff = assignedStaff;
    }
    
    public void setAssignedRoom(Room assignedRoom) {
        this.assignedRoom = assignedRoom;
    }
    
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    
    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }
}