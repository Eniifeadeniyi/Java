/*
Declare a variable called digit and set it to 1.
Declare a variable called countmax and set it to 0.
Declare a variable called max and set it to be equal to the minimum value.
As long as digit is greater than zero:
	Print enter a digit (or 0 to end)
	Store digit input into the variable(digit)
	Compare digit with max
	If digit is greater than max, set countmax to 1.
	If digit is equal to max, add 1 to countmax.
Print max
Print countmaxx 
*/

import java.util.Scanner;

public class OccurenceOfMaxNumber {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int digit = 1;
int countmax = 0;
int max = Integer.MIN_VALUE;

while(digit > 0) {
System.out.print("Enter a digit(or 0 to end): ");
digit = input.nextInt();

if(digit > max) {
max = digit;
countmax = 1;
}
else if (digit == max) {
countmax++;
}




}
System.out.println("The largest number is: " + max);
System.out.print("The occurence count of the largest number is: " + countmax);
}
}