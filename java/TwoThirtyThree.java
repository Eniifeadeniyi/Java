import java.util.Scanner;

public class TwoThirtyThree {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter your weight in kilograms: ");
double w = input.nextDouble();

System.out.print("Enter your height in meters: ");
double h = input.nextDouble();

double m = h * h;
double b = w / m;

System.out.print("Your BMI is : " + b + "\n");

if(b < 18.5) {
System.out.print("Underweight");
}

if(b >= 18.5)
if(b <= 24.9)  {
System.out.print("Healthy");
}

if(b >= 24.9) 
if(b <= 29.9) {
System.out.print("Overweight");
}

if(b > 30.0) {
System.out.print("Obesity");
}

}
}

//not working