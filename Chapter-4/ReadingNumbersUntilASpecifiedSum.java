import java.util.Scanner;

public class ReadingNumbersUntilASpecifiedSum {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int sum = input.nextInt();

int number; 
int numbersum = 0;  
  
while(numbersum < sum){
System.out.print("Enter a number: ");
number = input.nextInt();
numbersum += number;

if(numbersum >= sum) {
break;
}
}
}
}
