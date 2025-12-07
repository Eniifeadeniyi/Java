import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class Admin {
    private final String password;
    private final ArrayList<Room> rooms = new ArrayList<>();
    private final ArrayList<Customer> customers = new ArrayList<>();
    private double expectedRevenue;
    private double revenue;

    public Admin(String password) {
        this.password = password;
    }

    public int getNumberOfRegisteredCustomers() {
        return customers.size();
    }

    public boolean login(String password) {
        return this.password.equals(password);
    }


    public boolean checkCustomers(String username) {
        for (Customer customer : customers) {
            if (customer.getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    public Customer getCustomer(String username) {
        if (checkRooms(username)) {
            for (Customer customer : customers) {
                if (customer.getUsername().equals(username)) {
                    return customer;
                }
            }
        }
        return null;
    }

    public Customer getCustomerByRoomNumber(String number){
        if(checkRooms(number)){
            for (Customer customer : customers) {
                if(customer.getRoomNumber().equals(number)){
                    return customer;
                }
            }
        }
        return null;
    }


    private boolean validateCustomerDetails(String fullName, String email, String phoneNumber){
        String[] names = fullName.split(" ");
        String[] partsOfEmail = email.split("@");
        return names.length == 2 && partsOfEmail.length == 2 && phoneNumber.length() == 11;
    }

    public void registerCustomer(String userName, String password, String fullName, String email, String phoneNumber){
        if(!checkCustomers(userName) && validateCustomerDetails(fullName, email, phoneNumber)){
            Customer customer = new Customer(userName, password, fullName, email, phoneNumber);
            customers.add(customer);
        }
    }

    private Room getRoomByType(String roomType) {
        if (checkRooms(roomType)) {
            for (Room room : rooms) {
                if(room.getRoomType().equalsIgnoreCase(roomType) && room.getIsAvailable()) {
                    return room;
                }
            }
        }
        return null;
    }

    public void giveCustomerARoom(String userName,String roomType, String checkInDate, int numberOfNights, boolean input){
        if(checkCustomers(userName)){
            Customer customer = getCustomer(userName);
            if(customer != null) {
                Room room = getRoomByType(roomType.toLowerCase());
                if(room != null){
                    customer.setRoomNumber(room.getRoomNumber());
                    customer.setReferenceNumber(generateReferenceNumber());
                    String number = customer.getRoomNumber();
                    Room place = getRoom(number);
                    if(place != null) {
                        place.setIsFestivePeriod(input);
                        setPricePerNight(customer.getRoomNumber());
                        customer.setPaymentDue(place.getPricePerNight() * numberOfNights);
                        expectedRevenue += customer.getPaymentDue();
                        place.setIsBooked(true);
                        place.setIsAvailable();

                    }
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate localDate = LocalDate.parse(checkInDate, formatter);
                    LocalDate checkOutDate = localDate.plusDays(numberOfNights);
                    customer.setCheckInDate(localDate);
                    customer.setCheckOutDate(checkOutDate);
                }
            }
        }
    }
    private boolean checkRooms(String number) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(number)) {
                return true;
            }
        }
        return false;
    }

    private Room getRoom(String number) {
        if (checkRooms(number)) {
            for (Room room : rooms) {
                if (room.getRoomNumber().equals(number)) {
                    return room;
                }
            }
        }
        return null;
    }

    private boolean validateRoomNumberAndType(String roomNumber, String roomType) {
        if(roomNumber.length() == 3) {
            return roomType.equalsIgnoreCase("single") || roomType.equalsIgnoreCase("double") || roomType.equalsIgnoreCase("suite");
        }
        return false;
    }

    public void addARoom(String number, String type) {
        if (!checkRooms(number) && validateRoomNumberAndType(number, type)) {
            Room room = new Room(number, type.toLowerCase());
            rooms.add(room);
        }
    }

    public int getNumberOfRoomsInRooms(){
        return rooms.size();
    }

    public int getNumberOfCustomers() {
        return customers.size();
    }

    public void putRoomUnderMaintenance(String number) {
        Room room = getRoom(number);
        if (room != null) {
            if (room.getIsAvailable()) {
                room.setIsUnderMaintenance(true);
                room.setIsAvailable();
            }
        }
    }

    public void removeRoomFromUnderMaintenance(String number) {
        Room room = getRoom(number);
        if (room != null) {
                room.setIsUnderMaintenance(false);
                room.setIsAvailable();
        }
    }

    private String generateReferenceNumber() {
        String referenceNumber = "RES";
        Random rand = new Random();
        for (int count = 1; count <= 4; count++) {
            int number = rand.nextInt(10);
            referenceNumber += String.valueOf(number);
        }
        return referenceNumber;
    }


    public void setPricePerNight(String number) {
        Room room = getRoom(number);
        if (room != null) {
            if (!room.getIsFestivePeriod()) {
                switch (room.getRoomType()) {
                    case "single" -> room.setPricePerNight(10000);
                    case "double" -> room.setPricePerNight(12000);
                    case "suite" -> room.setPricePerNight(15000);
                }
            }
            if(room.getIsFestivePeriod()) {
                switch (room.getRoomType()) {
                    case "single" -> room.setPricePerNight(12000);
                    case "double" -> room.setPricePerNight(18000);
                    case "suite" -> room.setPricePerNight(30000);
                }
            }
        }
    }

    public ArrayList<Room> getAllAvailableRooms() {
        ArrayList<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if(room.getIsAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public ArrayList<Room> getAllRooms(){
        return rooms;
    }

    public void makeRoomAvailable(String username, String referenceNumber){
        Customer customer = getCustomer(username);
        if (customer != null) {
            if(customer.getReferenceNumber().equals(referenceNumber)) {
                String number = customer.getRoomNumber();
                expectedRevenue -=  customer.getPaymentDue();
                customer.setRoomNumber(null);
                customer.setReferenceNumber(null);
                customer.setCheckInDate(null);
                customer.setPaymentDue(0);
                customer.setCheckOutDate(null);
                Room room = getRoom(number);
                if (room != null) {
                    room.setIsBooked(false);
                    room.setIsAvailable();
                }
            }
        }
    }

    private void calculateRevenueGenerated(){
        for(Customer customer : customers){
            if(customer.getPaymentStatus()) revenue += customer.getTotalPaid();
        }
    }

    private void calculateExpectedRevenue(){
        for(Customer customer : customers){
            expectedRevenue += customer.getPaymentDue();
        }
    }

    public double getExpectedRevenue(){
        return expectedRevenue;
    }

    public double getActualRevenue(){
        return revenue;
    }

}
