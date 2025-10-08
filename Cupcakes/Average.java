public class Average {
public static void main(String[] args) {

System.out.print(averageArray(new int [] {1,2,3,4,5,6,7,8,9,10}));
}

public static double averageArray(int[] numbers) {
	int count = 0;
	double sum = 0.0;
	
	while(count < 10) {
		sum += numbers[count];
		count++; 
	}
	return sum / count;

}
}


