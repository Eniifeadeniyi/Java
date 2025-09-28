import java.util.Scanner;

public class Palindromes {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a five-digit number: ");
int number = input.nextInt();

while(number > 99999 || number < 10000) {
System.out.print("Invalid input!");
System.out.print("Enter a five-digit number: ");
number = input.nextInt();
}

if(number <= 99999 && number >= 10000) {
int digit1 = number / 10000;
int digit2 = (number % 10000) / 1000;
int digit3 = (number % 1000) / 100;
int digit4 = (number % 100) / 10;
int digit5 = number % 10;

int newnumber = (digit5 * 10000) + (digit4 * 1000) + (digit3 * 100) + (digit2 * 10) + digit1;

if(newnumber == number) {
System.out.print(number + " is a palindrome!");
}
else {
System.out.print(number + " is not a palindrome!");
}
}

}
}
