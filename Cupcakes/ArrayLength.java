public class ArrayLength {
public static void main(String[] args) {

System.out.print(getArrayLength(new int [] {1,2,3,4,5,6,7}));
}
public static int getArrayLength(int[] numbers) {
	int count = 0;
	while(count < numbers.length) {
		count++; 
}
return count;
}
}