public class Room{

    private String roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean isAvailable;
    private boolean isUnderMaintenance;
    private boolean isBooked;
    private boolean isFestivePeriod;

    public Room(String roomNumber, String roomType){
        if(roomType.trim().equalsIgnoreCase("Single") || roomType.trim().equalsIgnoreCase("Double") || roomType.trim().equalsIgnoreCase("Suite")) {
            if (roomNumber.trim().length() == 3) {
                this.roomNumber = roomNumber.trim();
                this.roomType = roomType.trim();
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
            if(input) isUnderMaintenance = true;
            if(!input)isUnderMaintenance = false;
    }

    public void setIsAvailable(){
        isAvailable = !isBooked && !isUnderMaintenance;
    }

    public void setIsBooked(boolean input){
        isBooked = input;
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