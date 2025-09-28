import java.util.Scanner;

public class Indices {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 

System.out.print("Enter a number: ");
int number = input.nextInt();

System.out.print("Enter another number: ");
int power = input.nextInt();
  
int answer = 1;
int indice = 1;
  
while(indice <= power) {
answer = answer * number;
indice += 1;
}
System.out.print(number + " raised to the power of " + power + " is " + answer);

}
}
