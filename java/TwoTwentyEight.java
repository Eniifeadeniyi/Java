import java.util.Scanner;

public class TwoTwentyEight {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter radius of the circle: ");
int r = input.nextInt();

int d = r * 2;
System.out.printf("The diameter of the circle is %d\n", d);

float p = 22/7;

float c = 2 * p * r;
System.out.printf("The circumference of the circle is "+ c +" \n");

float a = p * r * r;
System.out.printf("The area of the circle is "+ a +" \n");

}
}

 