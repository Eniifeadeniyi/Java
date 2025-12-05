import AccountExceptions.InvalidDepositAmountException;

public class Account {
    private int balance;

    public int getbalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount < 0) throw new InvalidDepositAmountException("You cannot deposit a negative amount");
        else balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}
