import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AdminTest{

    Admin admin;
    @BeforeEach
    public void setUp(){
        admin = new Admin("admin123");
    }

    @Test
    public void testRegisterCustomer(){
        admin.registerCustomer("eni", "12345", "Eniifeoluwa Adeniyi", "eniifeoluwaadeniyi@gmail.com", "08069902899");
        assertEquals(1,admin.getNumberOfRegisteredCustomers());
    }

    @Test
    public void testThatYouCannotHaveDuplicateOfCustomerDetail(){
        admin.registerCustomer("eni","12345", "Eniifeoluwa Adeniyi", "eniifeoluwaadeniyi@gmail.com", "08069902899");
        admin.registerCustomer("eni","12345", "Tomiwa Adeniyi", "eniifeoluwaadeniyi@gmail.com", "08069902899");
        assertEquals(1,admin.getNumberOfRegisteredCustomers());
    }

    @Test
    public void testLogin(){
        assertFalse(admin.login("32"));
        assertTrue(admin.login("admin123"));
    }

    @Test
    public void testThatAdminCanAddARoom(){
        admin.addARoom("101","single");
        admin.addARoom("102","single");
        admin.addARoom("101","double");
        admin.addARoom("1234","double");
        assertEquals(2,admin.getNumberOfRoomsInRooms());
    }

    @Test
    public void testThatRoomIsAvailableUponCreation(){
        admin.addARoom("101","single");
        admin.addARoom("102","double");
        ArrayList<Room> rooms = admin.getAllAvailableRooms();
        assertEquals(2,rooms.size());
    }

    @Test
    public void testThatRoomBecomesUnavailableWhenAdminPutsItForMaintenance(){
        admin.addARoom("101","single");
        admin.addARoom("102","double");
        admin.putRoomUnderMaintenance("101");
        ArrayList<Room> rooms = admin.getAllAvailableRooms();
        assertEquals(1,rooms.size());
    }

    @Test
    public void testThatGetAllRoomsReturnsAllRooms(){
        admin.addARoom("101","single");
        admin.addARoom("102","double");
        admin.addARoom("005","double");
        admin.putRoomUnderMaintenance("101");
        admin.putRoomUnderMaintenance("102");
        admin.putRoomUnderMaintenance("005");
        ArrayList<Room> rooms = admin.getAllRooms();
        assertEquals(3,rooms.size());
    }

    @Test
    public void testThatAdminCanRemoveARoomFromMaintenance(){
        admin.addARoom("101","single");
        admin.addARoom("102","double");
        admin.addARoom("005","double");
        admin.putRoomUnderMaintenance("101");
        ArrayList<Room> rooms = admin.getAllAvailableRooms();
        assertEquals(2,rooms.size());
        admin.removeRoomFromUnderMaintenance("101");
        rooms = admin.getAllAvailableRooms();
        assertEquals(3,rooms.size());
    }

    @Test
    public void testThatAdminCanAssignARoomToACustomerAndRoomBecomesUnavailable(){
        admin.addARoom("100", "single");
        admin.addARoom("101", "double");
        admin.addARoom("102", "double");
        admin.addARoom("005", "suite");
        Customer customer1 = admin.registerCustomer("eni", "12345", "Eniifeoluwa Adeniyi", "eniifeoluwaadeniyi@gmail.com", "08069902899");
        Customer customer2 = admin.registerCustomer("tomi", "2564", "Tomiwa Shekinah","tomiwa@gmail.com", "08023465970");
        ArrayList<Room> rooms = admin.getAllAvailableRooms();
        assertEquals(4,rooms.size());
        assertEquals(2,admin.getNumberOfCustomers());
        admin.giveCustomerARoom("eni", "double", "12/03/2028", 3, false);
        rooms = admin.getAllAvailableRooms();
        assertEquals(3,rooms.size());
        assertEquals("101", customer1.getRoomNumber());
        assertEquals(36000, customer1.getPaymentDue());
    }



}