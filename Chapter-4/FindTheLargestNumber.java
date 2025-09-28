import java.util.Scanner;

public class FindTheLargestNumber {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter number of units sold: ");
int number = input.nextInt();

int maximum = number;
int counter = 1;

while(counter < 10) {
System.out.print("Enter number of units sold: ");
int next_number = input.nextInt();

if(next_number > maximum) {
maximum = next_number;
}

counter += 1;

}
System.out.print("The largest number of units sold is: " + maximum);
}
}
