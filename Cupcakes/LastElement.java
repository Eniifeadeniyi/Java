public class LastElement {
public static void main(String[] args) {

System.out.print(getLastElement(new int [] { }));
}
public static int getLastElement(int[] numbers) {
	if(numbers.length == 0) {
		return 0;
	}
	return numbers[numbers.length - 1];



}
}
