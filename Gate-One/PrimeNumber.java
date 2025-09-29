import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a positive number: ");
int number = input.nextInt();

int divisor = 2;
while(divisor <= number) {
  if (number % divisor == 0) {
    System.out.print(number + " is not a prime number");
      }
    divisor++;
    if(number % divisor != 0) {
      System.out.print(number + " is a prime number");
      break;
       
    }
    }
}
}
}
