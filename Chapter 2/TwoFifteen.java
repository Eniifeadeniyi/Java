import java.util.Scanner;

public class TwoFifteen {
  public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
    int a = input.nextInt();

System.out.print("Enter an integer: ");
    int b = input.nextInt();

	int c = a * a;
	int d = b * b;
	int sum = c + d;
	int difference = c - d; 
 System.out.printf("The square of the first number is:  %d%n", c);
System.out.printf("The square of the second number is:  %d%n", d);
System.out.printf("The sum of the squares  is:  %d%n", sum);
System.out.printf("The difference of the two square is:  %d%n", difference);
}
}