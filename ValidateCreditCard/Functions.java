public class Functions {

public static String checkCardType(String cardNumber) {
	char firstDigit = cardNumber.charAt(0);
	char secondDigit = cardNumber.charAt(1);
	String cardType = "Invalid";
	switch(firstDigit) {
		case '4' -> cardType = "Visa Card";
		case '5' -> cardType =  "MasterCard";
		case '3' ->  {
			if(secondDigit == '7') cardType =  "American Express Card";}
		case '6' -> cardType =  "Discover card";
}
	return cardType;

}

public static String checkCardNumberLength(String cardNumber) {
	if(cardNumber.length() > 12 && cardNumber.length() < 17) return "Valid";
	return "Invalid";

}

public static int doubleEverySecondDigit(String cardNumber) {
	char[] numbers = cardNumber.toCharArray();
	int sum = 0;
	for(int count = cardNumber.length() - 2; count > -1; count -= 2) {
		int number = Character.getNumericValue(numbers[count]);
		int multiple = number * 2;
		if(multiple < 10) sum += multiple;
		if(multiple >= 10) {
			int digitSum = (multiple / 10) + (multiple % 10);
			sum += digitSum;
		}
	
		
}
	return sum;
}

public static int doubleOtherDigits(String cardNumber) {
	int sum = 0;
	char[] numbers = cardNumber.toCharArray();
	for(int count = cardNumber.length() - 1; count > -1; count -= 2) {
		int number = Character.getNumericValue(numbers[count]);
		sum += number;
}
	return sum;
}

public static int sumBothSums(String cardNumber) {
	int sumA = doubleEverySecondDigit(cardNumber);
	int sumB = doubleOtherDigits(cardNumber);
	int total = sumA + sumB;
	return total;
}

public static String checkValidityOfBothSums(String cardNumber) {
	int total = sumBothSums(cardNumber);
	if(total % 10 == 0) return "Valid";
	return "Invalid";
}

}