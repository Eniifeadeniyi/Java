public class Kata {

public static int factorOf(int number) {
	int divisor = 1;
	int factorCount = 0;
	while(divisor <= number) {
		int divide = number % divisor;
		if(divide == 0){
			factorCount += 1;
		}
		divisor += 1;
	}
	return factorCount;
}



public static boolean isPrimeNumber(int number) {
	int divisor = 1;
	int factorCount = 0;
	while(divisor <= number) {
		int divide = number % divisor;
		if(divide == 0){
			factorCount += 1;
		}
		divisor += 1;
	}

	if(factorCount == 2) {
		return true;
	}
	if(factorCount > 2) {
		return false; 
	}
	return false;
}


public static boolean isOdd(int number) {
	if(number % 2 != 0) {
		return true;
	}
	if(number % 2 == 0) {
		return false;
	}
	return false;
}

public static boolean isLeapYear(int year) {
	if(year % 4 == 0) {
		if(year % 100 != 0) {
		return true;
		}
	}

	if(year % 4 == 0) {
		if(year % 100 == 0) {
			if(year % 400 == 0) {
				return true;

			}
		}
	}

	if(year % 4 == 0) {
		if(year % 100 == 0) {
			if(year % 400 != 0) {
				return false;
			}
		}
	}

	if(year % 4 != 0) {
		return false;
	}
	return false;
}


public static double fahrenheitConverter(int fahrenheit) {
	double celsius = 5 * (fahrenheit - 32) / 9;
	return celsius;
}


public static boolean isEven(int number) {
	if(number % 2 == 0) {
		return true;
	}
	return false;
}


public static int subtract(int firstNumber, int secondNumber) {
	int difference = firstNumber - secondNumber;
	if(difference < 0) {
		difference *= -1;
	}
	return difference;
}

public static boolean isSquare(int number) {
	public static boolean isSquare(int number) {
	int divisor = 1;
	int factorCount = 0;
	while(divisor <= number) {
		int divide = number % divisor;
		if(divide == 0){
			factorCount += 1;
		}
		divisor += 1;
	}

	if(factorCount % 2 != 0) {
		return true;
	}

return false;
}
 
public static long factorialOf(int number){
	int factorial = 1;
	int counter = 1;
	while(counter <= number) {
		factorial *= counter;
		counter++;
	}
return factorial;
}

public static long squareOf(int number) {
	int answer = number * number;
return answer;
}

public static float divide(int firstNumber, int secondNumber) {
	if(secondNumber == 0) {
		return 0;
	} else {
		return firstNumber / secondNumber;
}

}

public static boolean isPalindrome(int number) {
	int firstDigit = number / 10000;
	int secondDigit = (number % 10000) / 1000;
	int thirdDigit = (number % 1000) / 100;
	int fourthDigit = (number % 100) / 10;
	int fifthDigit = number % 10;
	if(firstDigit == fifthDigit & secondDigit == fourthDigit) {
		return true;
}	
return false;
}



}
