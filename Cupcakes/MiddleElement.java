public class MiddleElement {
public static void main(String[] args) {

System.out.print(getMiddleElement(new int [] {1,2,3,4,5,6,7}));
}

public static int getMiddleElement(int[] numbers) {
	for(int count = 0; count < numbers.length; count++) {
	}
	int count = numbers.length;
	if(numbers.length % 2 != 0) {
		count = (numbers.length + 1) / 2;
		int middle = numbers[count - 1] ;
		return middle;
	}
	if(numbers.length % 2 == 0) {
		count = (numbers.length + 1) / 2;
<<<<<<< HEAD
		int middle = numbers[count - 1];				
=======
		int middle = numbers[count - 1];		
>>>>>>> 6b2786c2c628195068648e7537ac1050cea1e5ca
		return middle;
	}
return 0;

}
}
