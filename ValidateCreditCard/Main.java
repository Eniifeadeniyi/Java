package ValidateCreditCard;

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Hello, kindly enter card details to verify: ");
while(!input.hasNext()) {
	System.out.print("Invalid input!");
	System.out.print("Hello, kindly Enter Card details to verify: ");
	input.nextLine();
}
String cardNumber = input.next();
System.out.println("Credit Card Type: " + Functions.checkCardType(cardNumber));
System.out.println("Credit Card Number: " + cardNumber);
System.out.println("Credit Card Digit Length: " + cardNumber.length());
if(!(Functions.checkCardType(cardNumber).equals("Invalid")) && !(Functions.checkCardNumberLength(cardNumber).equals("Invalid"))) 
	System.out.print("Credit Card Validity Status: " + Functions.checkValidityOfBothSums(cardNumber));

else System.out.print("Credit Card Validity Status: Invalid");


}

}
	
