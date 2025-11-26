import java.util.Arrays;
public class LCMOfArray {
public static void main(String[] args) {

int[] numbers = {2,10,5,15,20};
if(removeInvalid(numbers)) System.out.print(findLCM(numbers));
else System.out.print("Array must not contain zeros or negative numbers!");
}

public static boolean removeInvalid(int[] numbers) {
	for(int number : numbers) {
		if(number <=  0) return false;}
	return true;

}

public static int findLCM(int[] numbers) {
	int answer = 1;
	for(int number : numbers) {
		int multiple = 1;
		while(multiple != 0) {
		if(multiple % number != 0 || multiple % answer != 0) multiple++;
		if(multiple % number == 0 && multiple % answer == 0) {
			answer = multiple;
			break;}		
		 
}
}
	return answer;
}

}