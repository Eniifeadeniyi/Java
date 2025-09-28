import java.util.Scanner;

public class PositiveNegativeOrZero {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("How many numbers will you like to enter?: ");
int sentinel = input.nextInt();


int positives = 0;
int negatives = 0;
int zeros = 0;
int count = 0;

while(count < sentinel) {
System.out.print("Enter a number: ");
int number = input.nextInt();

if (number > 0) {
positives += 1;
}

if(number < 0) {
negatives += 1;
}

if(number == 0) {
zeros += 1;
}
  
count += 1;
}
System.out.println("There are " + positives + " positive numbers.");
System.out.println("There are " + negatives + " negative numbers.");
System.out.print("There are " + zeros + " zeros.");
}
}
