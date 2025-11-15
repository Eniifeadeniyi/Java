import java.util.Scanner;
import java.util.Arrays;
public class Example {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);


System.out.print("Enter a sentence: ");
String sentence = input.nextLine();
 
System.out.print(reverseEachWord(sentence));

}

public static String reverseEachWord(String sentence) {
	String[] words = sentence.split(" ");
	String result = "";
	for(String word : words) {
		String reverse = " ";
		for(int count = 0; count < word.length(); count++) {
			reverse = word.charAt(count) + reverse;}
			result += reverse;
	
}
return result;
}

	
}