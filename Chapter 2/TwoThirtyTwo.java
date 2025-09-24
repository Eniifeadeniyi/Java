import java.util.Scanner;

public class TwoThirtyTwo {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
int a = input.nextInt();

System.out.print("Enter second number: ");
int b = input.nextInt();

System.out.print("Enter third number: ");
int c = input.nextInt();

System.out.print("Enter fourth number: ");
int d = input.nextInt();

System.out.print("Enter fifth number: ");
int e = input.nextInt();

if(a < 0) {
System.out.printf("%s%n", "Your first number is negative");
}
if(b < 0) {
System.out.printf("%s%n", "Your second number is negative");
}
if(c < 0) {
System.out.printf("%s%n", "Your third number is negative");
}
if(d < 0) {
System.out.printf("%s%n", "Your fourth number is negative");
}
if(e < 0) {
System.out.printf("%s%n", "Your fifth number is negative");
}

if(a > 0) {
System.out.printf("%s%n", "Your first number is positive");
}
if(b > 0) {
System.out.printf("%s%n", "Your second number is positive");
}
if(c > 0) {
System.out.printf("%s%n", "Your third number is positive");
}
if(d > 0) {
System.out.printf("%s%n", "Your fourth number is positive");
}
if(e > 0) {
System.out.printf("%s%n", "Your fifth number is positive");
}

if(a == 0) {
System.out.printf("%s%n", "Your first number is zero");
}
if(b == 0) {
System.out.printf("%s%n", "Your second number is zero");
}
if(c == 0) {
System.out.printf("%s%n", "Your third number is zero");
}
if(d == 0) {
System.out.printf("%s%n", "Your fourth number is zero");
}
if(e == 0) {
System.out.printf("%s%n", "Your fifth number is zero");
}

}
}


