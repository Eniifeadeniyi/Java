public class LastElement {
public static void main(String[] args) {

System.out.print(getLastElement(new int [] {2,4,6,8,10}));
}
public static int getLastElement(int[] numbers) {
	if(numbers.length == 0) {
		return 0;
	}
	return numbers[numbers.length - 1];



}
}
