import BankExceptions.AccountNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest{

    Bank gtb;
    @BeforeEach
    public void setUp(){
        gtb = new Bank();
    }

    @Test
    public void BankHasNoAccountsUponCreation(){
        assertTrue(gtb.isEmpty());
    }

    @Test
    public void BankCanCreateAnAccount(){
        gtb.createAccount("eniife", "adeniyi", "12345");
    }

    @Test
    public void BankCanSeeAccountBalance(){
        gtb.createAccount("eniife", "adeniyi", "12345");
        assertEquals(0,gtb.getBalance(1,"12345"));
    }

    @Test
    public void ExceptionThrownForUncreatedAccountNumber(){
        assertThrows(AccountNotFoundException.class, () -> gtb.getBalance(1,"145"));
    }

    @Test
    public void deposit5kInAccountAMakesAccountABalance5K(){
        gtb.createAccount("eniife", "adeniyi", "12345");
        gtb.createAccount("tomi", "oluwole", "153");
        gtb.deposit(1,  5000);
        assertEquals(5000,gtb.getBalance(1,"12345"));
    }

    @Test
    public void depositIntoNonExistentAccountThrowsException(){
        assertThrows(AccountNotFoundException.class, () -> gtb.deposit(1, 10000));
    }

    @Test
    public void deposit3KWithdraw2k(){
        gtb.createAccount("eniife", "adeniyi", "12345");
        gtb.deposit(1, 3000);
        gtb.withdraw(1,"12345",2000);
        assertEquals(1000,gtb.getBalance(1,"12345"));
    }

    @Test
    public void withdrawFromNonExistentAccountThrowsException(){
        assertThrows(AccountNotFoundException.class, () -> gtb.withdraw(1,"12345", 10000));
    }

    @Test
    public void deposit5kInATransfer3kFromAToB(){
        gtb.createAccount("eniife", "adeniyi", "12345");
        gtb.createAccount("tomi", "oluwole", "153");
        gtb.deposit(1,  5000);
        assertEquals(5000,gtb.getBalance(1,"12345"));
        assertEquals(0,gtb.getBalance(2,"153"));
        gtb.transferFrom(1,2,3000,"12345");
        assertEquals(2000,gtb.getBalance(1,"12345"));
        assertEquals(3000,gtb.getBalance(2,"153"));
    }

    @Test
    public void transferToNonexistentAccountThrowsException(){
        gtb.createAccount("eniife", "adeniyi", "12345");
        gtb.deposit(1,  5000);
        assertThrows(AccountNotFoundException.class, () -> gtb.transferFrom(1,2,3000,"12345"));
    }

    @Test
    public void transferFromNonexistentAccountThrowsException(){
        assertThrows(AccountNotFoundException.class, () -> gtb.transferFrom(1,2,3000,"12345"));
    }


}