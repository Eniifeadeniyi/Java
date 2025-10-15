public class CountE {
public static void main(String[] args) {

String[] word = {"e","o","p","u","l","a","r"};

int counter = 0;
for(int count = 0; count < word.length; count++) {
	if(word[count].equals("e")) counter += 1;
}
System.out.print(counter);
}
}