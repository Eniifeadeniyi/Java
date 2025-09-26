/*
Declare a variable, future.
Declare a variable, past.
Declare a variable, father, and set it to 1.
Declare a variable, son, and set it to 1.
Ask user to input current age in years.
If these conditions are met : 
	The father's age should range from 1 to 80, and should always be greater than the son's, assign the entered value to father.
	Ask user to input son's current age in years, and assign it to son.
If the conditions aren't met, display Unsupported age!
Calculate the number of years it will take for the father's age to be twice his son's, and assign it to future.
Calculate the number of years ago the father's age was twice his son's, and assign it to past.
Print future
Print absolute value of past.
*/

import java.util.Scanner;

public class TwiceSonAge {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int future;
int past;
int father = 1;
int son = 1;

System.out.print("Enter your current age(in years): ");
if(father >= 1 && father <= 80) {
father = input.nextInt();
if(father > 80) {
System.out.println("Unsupported age!");
}
}
if(father >= 1 && father <= 80) {
System.out.print("Enter your son's current age(in years): ");
son = input.nextInt();
}
if(father < son) {
System.out.println("Unsupported age!");
}

if(father >= 1 && father <= 80 && father > son) {
future = father - (2 * son);
System.out.println("It will take " + future + " years for the father's age to be twice his son's age");

if(father >= 1 && father <= 80 && father > son) {
past = ((2 * son) - father) * -1;
System.out.print("The father's age was twice his son's age " + past + " years ago.");
}
}
}
}
