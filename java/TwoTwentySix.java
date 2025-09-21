import java.util.Scanner;

public class TwoTwentySix {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int e = input.nextInt();

System.out.print("Enter second integer: ");
int f = input.nextInt();

int g = e * 3;
int j = f * 2;

if(j % g == 0) {
System.out.printf("%d is a multiple of %d", g,j);
}

if(j % g != 0) {
System.out.printf("%d is not a multiple of %d", g,j);
}

}
}


