public class MiddleElement {
public static void main(String[] args) {

System.out.print(getMiddleElement(new int [] {1,2,3,4,5,6}));
}

public static int getMiddleElement(int[] numbers) {
	for(int count = 0; count < numbers.length; count++) {
	}
	int count = numbers.length;
	if(count % 2 != 0) {
		count = (numbers.length + 1) / 2;
		int middle = numbers[count - 1] ;
		return middle;
	}
	if(count % 2 == 0) {
		count = (numbers.length + 1) / 2;
		int middle = numbers[count - 1];		return middle;
	}
return 0;

}
}
