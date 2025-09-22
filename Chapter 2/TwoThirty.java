import java.util.Scanner;

public class TwoThirty {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a five-digit integer: ");
int a = input.nextInt();

if(10000 <= a) 
if(a <= 99999) {
int b = a / 10000;
int c = (a % 10000) / 1000;
int d = (a % 1000) /  100;
int e = (a % 100) / 10;
int f = (a % 100) % 10;
System.out.printf("%d   %d   %d   %d   %d", f,  e,   d,  c,  b);
}

if(a  > 99999) {
System.out.print("Invalid input!");
}

if(a < 10000){
System.out.print("Invalid input!");
}
}
}



