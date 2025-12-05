import AccountExceptions.*;

public class Account {
    private int balance;
    private String password;
    private int accountNumber;

    public Account(String password){
        this.password = password;
    }

    private boolean validatePassword(String password){
        if(!password.equals(this.password)) throw new IncorrectPasswordException("Incorrect password");
        return true;
    }

    public int getbalance(String password){
        if(!validatePassword(password)) throw new IncorrectPasswordException("Incorrect password");
        return balance;
    }

    public void deposit(int amount, String password){
        if(!validatePassword(password)) throw new IncorrectPasswordException("Incorrect password");
        if(amount < 0) throw new InvalidDepositAmountException("You cannot deposit a negative amount");
        else balance += amount;
    }

    public void withdraw(int amount, String password) {
        if(!validatePassword(password)) throw new IncorrectPasswordException("Incorrect password");
        if(amount > balance) throw new InsufficientFundsException("Insufficient funds");
        if(amount < 0) throw new InvalidWithdrawAmountException("You cannot withdraw a negative amount");
        balance -= amount;
    }
}
