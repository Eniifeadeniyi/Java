import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

int divisor = 1;
int factorCount = 0;

while(divisor <= number) {
int divide = number % divisor;

if(divide == 0){
factorCount += 1;
}
divisor += 1;
}

if(factorCount == 2) {
System.out.print(number + " is a prime number");
}
if(factorCount > 2) {
System.out.print(number + " is not a prime number."); 
}
 
}
}
