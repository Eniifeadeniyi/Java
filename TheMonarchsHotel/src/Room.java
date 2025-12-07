public class Room{

    private String roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean isAvailable;
    private boolean isUnderMaintenance;
    private boolean isBooked;
    private boolean isFestivePeriod;

    public Room(String roomNumber, String roomType){
        roomType = roomType.trim().toLowerCase();
        roomNumber = roomNumber.trim();
        if(roomType.equals("single") || roomType.equals("double") || roomType.equals("suite")) {
            if (roomNumber.length() == 3) {
                this.roomNumber = roomNumber;
                this.roomType = roomType;
                isAvailable = true;
            }
        }
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setIsUnderMaintenance(boolean input){
            isUnderMaintenance = input;
            setIsAvailable();
    }

    public void setIsAvailable(){
        if(isBooked || isUnderMaintenance) isAvailable = false;
        if(!isBooked && !isUnderMaintenance) isAvailable = true;
    }

    public void setIsBooked(boolean input){
        isBooked = input;
        setIsAvailable();
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void setIsFestivePeriod(boolean input){
        isFestivePeriod = input;
    }

    public boolean getIsFestivePeriod(){
        return isFestivePeriod;
    }

    public void setPricePerNight(double pricePerNight){
        this.pricePerNight = pricePerNight;
    }

    public double getPricePerNight(){
        return pricePerNight;
    }

}