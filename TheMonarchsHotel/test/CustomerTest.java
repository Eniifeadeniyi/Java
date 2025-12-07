import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest{

    Customer customer;
    @BeforeEach
    public void setUp(){
        customer = new Customer("eni", "12345", "Eniifeoluwa Adeniyi",  "eniifeoluwaadeniyi@gmail.com", "08069902899");
    }

    @Test
    public void testCustomerCanEditProfile(){
        assertEquals("Eniifeoluwa Adeniyi", customer.getFullName());
        assertEquals("eniifeoluwaadeniyi@gmail.com", customer.getEmail());
        assertEquals("08069902899", customer.getPhoneNumber());
        customer.editEmail("anonymous123.adeniyi@gmail.com");
        customer.editFullName("Oluwatomi Ijapa");
        customer.editPhoneNumber("12345678908");
        assertEquals("anonymous123.adeniyi@gmail.com" ,  customer.getEmail());
        assertEquals("Oluwatomi Ijapa", customer.getFullName());
        assertEquals("12345678908", customer.getPhoneNumber());
    }



}