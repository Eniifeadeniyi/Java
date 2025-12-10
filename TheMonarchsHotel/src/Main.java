import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin madamEniife = new Admin("admin123");
        String menu = """
                Welcome to The Monarchs Hotel!
                1. Login as Admin
                2. Login as Customer
                3. Register
                4. Exit
                Enter your choice:
                """;
        boolean check = true;
        while (check) {
            System.out.println(menu);
            char choice = input.next().charAt(0);
            switch (choice) {
                case '4' -> check = false;
                case '1' -> {
                    System.out.println("Enter password: ");
                    String password = input.next();
                    if (madamEniife.login(password)) {
                        String adminMenu = """
                                Welcome, Madam Eniife!
                                Options:
                                1. View All Rooms
                                2. Manage Reservations
                                3. Generate Reports
                                4. Mark Rooms for Maintenance
                                5. Add rooms
                                6. View guest Details
                                7. Log out
                                Enter your choice:
                                """;
                        boolean checker = true;
                        while (checker) {
                            System.out.println(adminMenu);
                            char operation = input.next().charAt(0);
                            switch (operation) {
                                case '1' -> {
                                    ArrayList<Room> rooms = madamEniife.getAllRooms();
                                    System.out.printf("%-10s %-10s %-10s", "RoomNumber", "RoomType", "RoomStatus");
                                    for (Room room : rooms) {
                                        System.out.printf("%-10s %-10s %-10b", room.getRoomNumber(), room.getRoomType(), room.getIsAvailable());
                                    }
                                }
                                case '2' -> {
                                }
                                case '3' -> {
                                }
                                case '4' -> {
                                    System.out.print("Enter room number: ");
                                    String roomNumber = input.next().trim();
                                    madamEniife.putRoomUnderMaintenance(roomNumber);
                                }
                                case '5' -> {
                                    System.out.print("Enter room number: ");
                                    String roomNumber = input.next().trim();
                                    System.out.print("Enter room type: ");
                                    String roomType = input.next().trim();
                                    madamEniife.addARoom(roomNumber, roomType);
                                }
                                case '6' -> {
                                    System.out.print("Enter room number: ");
                                    String roomNumber = input.next().trim();
                                    Customer customer = madamEniife.getCustomerByRoomNumber(roomNumber);
                                    if (customer != null) {
                                        System.out.println("Guest Details:");
                                        System.out.println("Name: " + customer.getFullName());
                                        System.out.println("Phone: " + customer.getPhoneNumber());
                                        System.out.println("Email: " + customer.getEmail());
                                        System.out.println("Reservation Details:");
                                        System.out.println("Room Number: " + customer.getRoomNumber());
                                        System.out.println("Check-in-date: " + customer.getCheckInDate());
                                        System.out.println("Check-out-date: " + customer.getCheckOutDate());
                                        System.out.println("Booking Reference Number: " + customer.getReferenceNumber());
                                    }
                                    System.out.println("No occupant in this room or room not yet added!");
                                }
                                case '7' -> checker =  false;

                                default -> System.out.println("Invalid choice!");
                            }
                        }
                    } else System.out.println("Wrong password!");
                }
                case '2' -> {
                    System.out.println("Enter username: ");
                    String username = input.next().trim();
                    Customer customer = madamEniife.getCustomer(username);
                    if (customer != null) {
                        System.out.println("Enter password: ");
                        String password = input.next().trim();
                        if (customer.login(username, password)) {
                            String customerMenu = """
                                            Welcome, Our Esteemed Customer!
                                            Options:
                                            1. Book Room
                                            2. View Booking
                                            3. Edit Profile
                                            4. Check Room Availability
                                            5. Payment Status
                                            6. Cancel Booking
                                            7. View All Available Room
                                            8. View Notification
                                            9. Log out
                                            Enter your choice:
                                    """;
                            boolean checked = true;
                            while (checked) {
                                System.out.println(customerMenu);
                                char operation = input.next().charAt(0);
                                switch (operation) {
                                    case '9' -> checked = false;
                                    case '1' -> {
                                        customer.bookARoom();
                                    }
                                    case '6'->{
                                        System.out.print("Enter reference number: ");
                                        String referenceNumber = input.next().trim();
                                        madamEniife.makeRoomAvailable(username, referenceNumber);
                                    }
                                    case '5'-> {
                                        System.out.println(customer.checkPaymentStatus());
                                    }
                                    case '3'-> {
                                        String editMenu = """
                                                1. Name
                                                2. Phone number
                                                3. Email
                                                4. back
                                                Enter your choice:
                                                """;
                                        boolean cheek = true;
                                        while (cheek) {
                                            System.out.println(menu);
                                            char pick = input.next().charAt(0);
                                            switch (pick) {
                                                case '1' -> {
                                                    System.out.print("Enter name: ");
                                                    String newFirstName = input.nextLine().trim();
                                                    customer.editFullName(newFirstName);
                                                }
                                                case '2' -> {
                                                    System.out.print("Enter phone number: ");
                                                    String newPhoneNumber = input.nextLine().trim();
                                                    customer.editPhoneNumber(newPhoneNumber);
                                                }
                                                case '3' -> {
                                                    System.out.print("Enter email: ");
                                                    String newEmail = input.nextLine().trim();
                                                    customer.editEmail(newEmail);
                                                }
                                                case '4' -> cheek = false;
                                                default ->  System.out.println("Invalid choice!");
                                            }
                                        }
                                    }
                                    case '7' -> {
                                        ArrayList<Room> rooms = madamEniife.getAllAvailableRooms();
                                        for (Room room : rooms) {
                                            System.out.print("Room Number: " + room.getRoomNumber());
                                            System.out.println("Room Type: " + room.getRoomType());
                                        }
                                    }
                                    default ->  System.out.println("Invalid choice!");
                                }
                            }
                        }
                    }
                }
                default ->  System.out.println("Invalid choice!");
            }
        }
    }
}


