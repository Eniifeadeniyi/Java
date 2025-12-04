import org.junit.jupiter.api.BeforeEach;

public class CustomerTest{

    Customer customer;
    @BeforeEach
    public void setUp(){
        customer = new Customer("eni", "12345", "Eniifeoluwa Adeniyi", "08069902899", "eniifeoluwaadeniyi@gmail.com");
    }



}