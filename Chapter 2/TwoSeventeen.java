import java.util.Scanner;

public class TwoSeventeen {
  public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int a = input.nextInt();

System.out.print("Enter second integer: ");
int b = input.nextInt();

System.out.print("Enter third integer: ");
int c = input.nextInt();

int x = a + b + c;
int y = x / 3;
int z = a * b * c;

System.out.printf("The sum is: %d%n", x);
System.out.printf("The average is: %d%n", y);
System.out.printf("The product is: %d%n", z);

int min = a;
if(b < min) {
min = b;
}

if(c < min) {
min = c;
}

System.out.printf("The smallest number is: %d%n", min);

int max = a;
if(b > max) {
max = b;
}

if(c > max) {
max = c;
}

System.out.printf("The largest number is: %d%n", max);
}
}