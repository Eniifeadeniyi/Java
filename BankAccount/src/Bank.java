    import BankExceptions.*;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts =  new ArrayList<>();
    private int count;

    public boolean isEmpty() {
        return count == 0;
    }

    public Account createAccount(String firstName, String lastName, String password) {
        Account account = new Account(firstName, lastName, password);
        account.setAccountNumber(count+1);
        accounts.add(account);
        count++;
        return account;
    }

    private Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public int getBalance(int accountNumber, String password) {
        Account account = findAccount(accountNumber);
        if (account != null) return account.getbalance(password);
        throw new AccountNotFoundException("Account number not registered!");
    }

    public void deposit(int accountNumber, int amount) {
        Account account = findAccount(accountNumber);
        if (account != null) account.deposit(amount);
        else throw new AccountNotFoundException("Account number not registered!");
    }

    public void withdraw(int accountNumber, String password, int amount) {
        Account account = findAccount(accountNumber);
        if (account != null) account.withdraw(amount, password);
        else throw new AccountNotFoundException("Account number not registered!");
    }

    public void transferFrom(int senderAccountNumber, int receiverAccountNumber, int amount, String senderPassword) {
        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);
        if(senderAccount != null && receiverAccount != null) {
            senderAccount.withdraw(amount, senderPassword);
            receiverAccount.deposit(amount);
        }
        else throw new AccountNotFoundException("Account number not registered!");
    }
}
