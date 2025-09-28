import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

int factorial = 1;
int count = 1;

while(count <= number) {
factorial *= count;
count += 1;
}
System.out.print(number + "! is" + factorial);

}
}
