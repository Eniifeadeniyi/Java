public class FirstElement {
public static void main(String[] args) {

System.out.print(getFirstElement(new int [] {}));
}
public static int getFirstElement(int[] numbers) {
	if(numbers.length == 0) {
		return 0;
	}
return numbers[0];

}
}