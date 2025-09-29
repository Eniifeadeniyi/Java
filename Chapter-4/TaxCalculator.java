import java.util.Scanner;

public class TaxCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);


double earning = 0.00;
int earningCounter = 0;
double tax;


while(earningCounter < 3) {
System.out.print("Enter citizen's first name: ");
String name = input.next();

System.out.print("Enter citizen's earning(in USD): ");
earning = input.nextInt();

if(earning <= 30000.00) {
tax = 0.15 * earning;
}

else {
tax = (0.15 * 30000.00) + (0.2 * (earning - 30000.00));
}

System.out.println(name + "'s total tax is: $" + tax ) ;

earningCounter += 1;
}


}
}
