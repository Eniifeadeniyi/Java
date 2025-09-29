import java.util.Scanner;

public class FindTheTwoLargestNumbers {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter number of units sold: ");
int number = input.nextInt();

int maximum = number;
int counter = 1;
int secondmaximum = number;

while(counter < 10) {
System.out.print("Enter number of units sold: ");
int nextnumber = input.nextInt();

if(nextnumber > maximum) {
secondmaximum = maximum; 
maximum = nextnumber;
}
else if (nextnumber > secondmaximum && nextnumber != maximum) {
secondmaximum = nextnumber;
}

counter += 1;

}
System.out.println("The largest number is: " + maximum);
System.out.print("The second largest number is: " + secondmaximum);
}
}
