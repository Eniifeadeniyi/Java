import AccountExceptions.IncorrectPasswordException;
import AccountExceptions.InsufficientFundsException;
import AccountExceptions.InvalidDepositAmountException;
import AccountExceptions.InvalidWithdrawAmountException;
import BankExceptions.AccountNotFoundException;

import java.util.Scanner;
public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static Bank eniife = new Bank();
    public static void main(String[] args) {

        String menu = """
                1. Make a new account
                2. Withdraw
                3. Deposit
                4. Transfer
                5. Check balance
                6. Exit
                """;
        while(true) {
            System.out.println(menu);
            char choice = input.next().charAt(0);
            switch(choice) {
                case '1'-> makeAccount();
                case '2'-> withdraw();
                case '3'-> deposit();
                case '4'-> transfer();
                case '5'-> checkBalance();
                case '6'-> {
                    System.out.println("Goodbye!");
                    break;
                }
                default -> System.out.println("Unsupported choice!");
            }
        }

    }

    private static void checkBalance() {
        int accountNumber = Integer.parseInt(input("Enter account number: "));
        String password = input("Enter password: ");
        try{
            eniife.getBalance(accountNumber,password);
        }catch(AccountNotFoundException | IncorrectPasswordException e){
            System.out.println(e.getMessage());
        }
    }

    private static void transfer() {
        int senderAccount = Integer.parseInt(input("Enter your account number: "));
        int receiverAccount = Integer.parseInt(input("Enter receiver's account number: "));
        int amount = Integer.parseInt(input("Enter amount: "));
        String password = input("Enter password: ");
        try{
            eniife.transferFrom(senderAccount, receiverAccount, amount, password);
            System.out.println("Transfer successful!");
        }catch(IncorrectPasswordException | AccountNotFoundException | InvalidWithdrawAmountException | InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }

    private static void deposit() {
        int accountNumber = Integer.parseInt(input("Enter account number: "));
        int amount = Integer.parseInt(input("Enter amount to deposit: "));
        try{
            eniife.deposit(accountNumber,amount);
            System.out.println("Amount deposited successfully!");
        }catch(AccountNotFoundException | InvalidDepositAmountException e){
            System.out.println(e.getMessage());
        }
    }

    private static void withdraw() {
        int accountNumber = Integer.parseInt(input("Enter account number: "));
        String password = input("Enter password: ");
        int amount = Integer.parseInt(input("Enter amount to withdraw: "));
        try{
            eniife.withdraw(accountNumber,password,amount);
            System.out.println("Amount withdrawn successfully!");
        } catch(InsufficientFundsException | IncorrectPasswordException | AccountNotFoundException | InvalidWithdrawAmountException e){
            System.out.println(e.getMessage());
        }
    }

    private static void makeAccount() {
        String firstName = input("Enter first name: ");
        String lastName = input("Enter last name: ");
        String password = input("Enter password: ");
        Account account = eniife.createAccount(firstName,lastName,password);
        System.out.println("Account created successfully!");
        System.out.println("Your account number: " + account.getAccountNumber());
    }

    public static String input(String prompt){
        print(prompt);
        return input.nextLine();
    }

    public static void print(String message){
        System.out.println(message);
    }
}
