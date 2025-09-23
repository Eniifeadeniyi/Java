/*
Ask user to enter a letter.
Declare a variable, called letter, and assign the letter type in by the user to this variable.
Allow for user to be able to type in any case.
As long as the letter inputed is a, e, i, o, or u, print "the letter" is a vowel.
If not, print "the letter" is a consonant.
*/




import java.util.Scanner;

public class LetterChecker {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a letter: ");
String letter = input.nextLine().toLowerCase();

if (letter.equals("a")) {
System.out.print(letter + " is a vowel");
}

else if (letter.equals("e")) {
System.out.print(letter + " is a vowel");
}

else if (letter.equals("i")) {
System.out.print(letter + " is a vowel");
}

else if (letter.equals("o")) {
System.out.print(letter + " is a vowel");
}

else if (letter.equals("u")) {
System.out.print(letter + " is a vowel");
}

else {
System.out.print(letter + " is a consonant");
}


}
}
