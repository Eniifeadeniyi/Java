public class FindSmallest {
public static void main(String[] args) {


System.out.print(findSmallest(new int [] {22, 2, 3, 4, 5, 8, 0, 10, 6, 7}));
}

public static int findSmallest(int[] numbers) {
	int min = numbers[0];
	int count = 0;
	while(count < numbers.length) {
	if(numbers[count] < min) {
	min = numbers[count];
	}
	count++;
	}
return min;
}
}

