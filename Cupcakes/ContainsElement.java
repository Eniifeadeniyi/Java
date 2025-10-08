import java.util.Scanner;

public class ContainsElement {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print(containsElement(new int [] {12,13,13,13,11,11,11,11,14,15}));

}

public static boolean containsElement(int [] numbers) {
	for(int count = 0; count < 10; count++) {
		if(numbers[0] == numbers[count]) {
			return true;
		}
	}

return true;
}
}