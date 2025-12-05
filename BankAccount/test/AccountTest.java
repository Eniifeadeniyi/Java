import AccountExceptions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    Account account;
    @BeforeEach
    public void setUp() {
        account = new Account("156");
    }

    @Test
    public void balanceIsZeroUponCreation(){
        assertEquals(0,account.getbalance("156"));
    }

    @Test
    public void deposit2kBalanceIncreasesBy2k(){
        account.deposit(2000,"156");
        assertEquals(2000,account.getbalance("156"));
    }

    @Test
    public void ExceptionIsThrownWhenDepositingNegativeAmount(){
        assertThrows(InvalidDepositAmountException.class, () -> account.deposit(-200,"156" ));
        assertEquals(0,account.getbalance("156"));
    }

    @Test
    public void Deposit5kWithdraw2kBalanceIs3k(){
        account.deposit(5000,"156" );
        account.withdraw(2000, "156");
        assertEquals(3000,account.getbalance("156"));
    }

    @Test
    public void Withdraw2kFrom0Balance(){
        assertThrows(InsufficientFundsException.class, () -> account.withdraw(2000, "156"));
    }

    @Test
    public void Withdraw2kFrom4kBalance(){
        account.deposit(4000,"156" );
        account.withdraw(2000,"156");
        assertEquals(2000,account.getbalance("156"));
    }

    @Test
    public void WithdrawNegativeAmount(){
        assertThrows(InvalidWithdrawAmountException.class, () -> account.withdraw(-200,"156"));
    }

    @Test
    public void WrongPasswordEntered(){
        assertThrows(IncorrectPasswordException.class, () -> account.deposit(5000, "1234"));
        assertThrows(IncorrectPasswordException.class, () -> account.withdraw(5000, "1234"));
        assertThrows(IncorrectPasswordException.class, () -> account.getbalance("1234"));
    }



}