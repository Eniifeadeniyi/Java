import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin madamEniife = new Admin("admin123");
        String menu = """
                1. Login
                2. Register
                3. exit
                """;
        System.out.println(menu);
        System.out.print("Enter an operation: ");
        String operation = input.nextLine();
        switch (operation) {
            case "1" -> {
                System.out.print("Login as Admin or Guest? ");
                String user = input.next();
                while(!user.equalsIgnoreCase("admin") && !user.equalsIgnoreCase("guest")) {
                    System.out.println("Invalid input");
                    System.out.print("Login as Admin or Guest? ");
                    user = input.next();
                }
                switch (user) {
                    case "admin" -> {
                        System.out.println("Enter Admin Password: ");
                        String password = input.nextLine();
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
                                    """;
                            System.out.println(adminMenu);
                            System.out.print("Enter an operation: ");
                            String option = input.next();
                            switch (option) {
                                case "1" -> {
                                    ArrayList<Room> rooms = madamEniife.getAllRooms();
                                    for (Room room : rooms) {
                                        System.out.println("Room number : " + room.getRoomNumber());
                                        System.out.println("Room type : " + room.getRoomType());
                                    }
                                }
                                case "4" -> {
                                    System.out.print("Enter Room Number: ");
                                    String number = input.next();
                                    madamEniife.putRoomUnderMaintenance(number);
                                }

                                case "5" -> {
                                    System.out.print("Enter Room Number: ");
                                    String number = input.next();
                                    System.out.print("Enter Room Type(single/double/suite): ");
                                    String type = input.next();
                                    madamEniife.addARoom(number, type);
                                }

                                case "6" -> {
                                    System.out.print("View guest details for room: ");
                                    String number = input.next();
                                    if (madamEniife.getCustomerByRoomNumber(number) != null) {
                                        Customer customer = madamEniife.getCustomerByRoomNumber(number);
                                        System.out.println("Name: " + customer.getFullName());
                                        System.out.println("Phone: " + customer.getPhoneNumber());
                                        System.out.println("Email: " + customer.getEmail());
                                        System.out.println("Reservation Details:");
                                        System.out.println("Room Number: " + customer.getRoomNumber());
                                        System.out.println("Check-in-Date: " + customer.getCheckInDate());
                                        System.out.println("Check-out-Date: " + customer.getCheckOutDate());
                                        System.out.print("Booking Reference Number: " + customer.getReferenceNumber());
                                    }
                                }
                            }
                        }
                    }
                    case "guest" -> {
                        System.out.print("Enter username: ");
                        String name = input.nextLine();
                        System.out.print("Enter password: ");
                        String password = input.nextLine();
                        if(madamEniife.checkCustomers(name)){
                            Customer customer = madamEniife.getCustomer(name);
                            if(customer.login(name,password)){
                                String guestMenu = """
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
                                        """;
                                System.out.println(guestMenu);
                                System.out.print("Enter an operation: ");
                                String choice = input.next();
                                switch (choice) {
                                    case "1" -> {
                                        System.out.print("Enter room type of your choice(single/double/suite): ");
                                        String type = input.next();
                                        String userName = customer.getUserName();
                                        System.out.print("Enter check-in date(dd/mm/yyyy): ");
                                        String checkInDate = input.next();
                                        String[] dateArray = checkInDate.split("/");
                                        while(dateArray.length != 3){
                                            System.out.println("Please enter a valid date: ");
                                            checkInDate = input.next();
                                            dateArray = checkInDate.split("/");
                                        }
                                        System.out.print("Enter number of nights: ");
                                        while(!input.hasNextInt()){
                                            System.out.println("Please enter a valid number of nights: ");
                                            input.nextLine();
                                        }
                                        int numberOfNights = input.nextInt();
                                        //madamEniife.giveCustomerARoom(userName, type, checkInDate, numberOfNights);
                                    }
                                }
                            }
                        }

                    }
                }
            }
            case "2" ->{
                System.out.print("Enter a unique username: ");
                String username = input.nextLine();
                System.out.print("Enter a unique password: ");
                String password = input.nextLine();
                System.out.print("Enter your full name: ");
                String name = input.nextLine();
                System.out.print("Enter phone number: ");
                String phoneNumber = input.nextLine();
                System.out.print("Enter email: ");
                String email = input.nextLine();
                madamEniife.registerCustomer(username, password, name, phoneNumber, email);
            }
        }
    }
}
