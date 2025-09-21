import java.util.Scanner;

public class TwoTwentyFive {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
 System.out.print("Enter an integer: ");
int a = input.nextInt();

if(a % 3 == 0 ) {
System.out.printf("%d is divisible by 3", a);
}
if(a % 3 != 0) {
System.out.printf("%d is not divisible by 3", a);
}
}
}