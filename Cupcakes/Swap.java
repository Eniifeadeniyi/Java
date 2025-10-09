public class Swap {
public static void main(String[] args) {

swapFirstAndLast(new int [] {1,2,3,4});
}
public static void swapFirstAndLast(int[] numbers) {
	int[] result = new int [numbers.length];

	result[0] = numbers[numbers.length - 1];
	System.out.print(result[0]);

	result[numbers.length - 1] = numbers[0];
	System.out.print(result[numbers.length - 1]);

	for(int count = 1; count < numbers.length - 1; count ++) {
		result[count] = numbers[count];
		System.out.print(result[count]);
		}
}
}