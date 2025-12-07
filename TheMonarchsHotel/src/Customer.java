import java.time.LocalDate;

public class Customer {
    private String username;
    private String password;
    private String fullName;
    private String phoneNumber;
    private String email;
    private boolean paymentStatus;
    private String referenceNumber;
    private String roomNumber;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private double paymentDue;
    private double totalPaid;

    public Customer(String username, String password, String fullName, String phoneNumber, String email){
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public boolean login(String username, String password){
        return username.equals(this.username) && password.equals(this.password);
    }

    public void setCheckInDate(LocalDate checkInDate){
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate){
        this.checkOutDate = checkOutDate;
    }

    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }


    public String getRoomNumber(){
        return roomNumber;
    }

    public void editFullName(String newFullName){
        fullName = newFullName;
    }

    public void editPhoneNumber(String newPhoneNumber){
       phoneNumber = newPhoneNumber;
    }

    public void editEmail(String newEmail){
      email = newEmail;
    }

    public void makePayment(double amount){
            if (paymentDue - amount == 0) {
                paymentDue -= amount;
                totalPaid += amount;
                paymentStatus = true;
            }
            if (amount < paymentDue) paymentDue -= amount;
    }

    public String checkPaymentStatus(){
            if (paymentStatus) return "Paid";
            return "Payment due!";
    }

    public void setPaymentDue(double amount){
        paymentDue = amount;
    }

    public void setReferenceNumber(String referenceNumber){
        this.referenceNumber = referenceNumber;
    }

    public String getReferenceNumber(){
        return referenceNumber;
    }

    public String getUsername(){
        return username;
    }

    public double getPaymentDue(){
        return paymentDue;
    }

    public boolean getPaymentStatus(){
        return paymentStatus;
    }

    public double getTotalPaid(){
        return totalPaid;
    }

    public String getFullName(){
        return fullName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public LocalDate getCheckInDate(){
        return checkInDate;
    }

    public LocalDate getCheckOutDate(){
        return checkOutDate;
    }

}

