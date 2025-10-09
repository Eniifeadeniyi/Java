public class CountOccurrence {
public static void main(String[] args) {

System.out.print(countOccurrence(12, new int [] {13,14,12,12,12,15,12,20,12,12}));
}

public static int countOccurrence(int target, int[] numbers) {
	int targetCount = 0;
	for(int count = 0; count < numbers.length; count++) {
		if(numbers[count] == target) {
			targetCount += 1;
	}
	
}
return targetCount;
}

}