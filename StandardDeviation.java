import java.util.Scanner;

public class StandardDeviation {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("How many numbers will you like to input?");
int frequency = input.nextInt();

int[] values = new int[frequency];

int count = 0;
int totalUnknown = 0;
double deviation = 0;
double squareTotal = 0.0;

while(count <= frequency - 1) {
System.out.print("Enter a value of x: ");
int unknown = input.nextInt();
totalUnknown += unknown;

values[count] = unknown;
count++;

}
double average = totalUnknown / frequency;

count = 0;

while(count <= frequency - 1) {
deviation = values[count] -average;

count++;
double square = Math.pow(deviation, 2);

squareTotal += square;

}
double variance = squareTotal / frequency;
double answer = Math.pow(variance, 0.5); 
System.out.println("The standard deviation is: " + answer);
}
}