public class LargestDigit {
public static void main(String[] args) {

int number = 123458;
int[] numbers = {1,2,3,4,5,8};

int largestDigit = numbers[0];

int count = 0; 
while(count < numbers.length) {
	if(numbers[count] > largestDigit) largestDigit = numbers[count];
count++;
}

System.out.print(largestDigit);
}
}