import java.util.Scanner;

public class CreditLimitCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter your account number: ");
int accountnumber = input.nextInt();

System.out.print("Enter your initial balance: ");
int initialbalance = input.nextInt();

System.out.print("Enter total of all items charged by customer this month: ");
int items = input.nextInt();

System.out.print("Enter total of all credits applied to the customers account this month: ");
int total = input.nextInt();

System.out.print("Enter credit limit: ");
int creditlimit = input.nextInt();
int newbalance = initialbalance + (items - total);

System.out.print(newbalance);

if(newbalance > creditlimit) {
System.out.print("Credit limit exceeded!");
}


}

}
