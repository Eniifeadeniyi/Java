import AccountExceptions.InvalidDepositAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    Account account;
    @BeforeEach
    public void setUp() {
        account = new Account();
    }

    @Test
    public void balanceIsZeroUponCreation(){
        assertEquals(0,account.getbalance());
    }

    @Test
    public void deposit2kBalanceIncreasesBy2k(){
        account.deposit(2000);
        assertEquals(2000,account.getbalance());
    }

    @Test
    public void ExceptionIsThrownWhenDepositingNegativeAmount(){
        assertThrows(InvalidDepositAmountException.class, () -> account.deposit(-200));
        assertEquals(0,account.getbalance());
    }

    @Test
    public void Deposit5kWithdraw2kBalanceIs3k(){
        account.deposit(5000);
        account.withdraw(2000);
        assertEquals(3000,account.getbalance());
    }
}