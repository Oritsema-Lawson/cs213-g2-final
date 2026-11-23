package  clinic.model;

import  clinic.model.enums.RoomType;

public class Room {
    private String roomNum;
    private RoomType roomType;
    private boolean available;

    public Room(String roomNum, RoomType roomType, boolean available) {
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.available = available;
    }

    public String getRoomNum() { return roomNum; }
    public RoomType getRoomType() { return roomType; }
    public boolean isAvailable() { return available; }

   

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    
}