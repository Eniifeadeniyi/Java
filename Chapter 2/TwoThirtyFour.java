import java.util.Scanner;

public class TwoThirtyFour {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

long p = 8231613070L;
double g = 0.0085;

long a = (long) (g * p) + p;
System.out.printf("After one year: " + a + "\n");

long b = (long) (g * a) + a;
System.out.printf("After two years: " + b + "\n");

long c =(long)  (g * b) + b;
System.out.printf("After three years: " + c + "\n");

long d = (long) (g * c) + c;
System.out.printf("After four years: " + d + "\n");

long e =(long)  (g * d) + d;
System.out.printf("After five years: " + e + "\n");

}
}