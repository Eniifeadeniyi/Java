import java.util.Scanner;

public class Array {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int count = 0;
int[] scores = new int[5];

while(count < 5){
System.out.print("Enter a score: ");
int number = input.nextInt();

scores[count] = number;
count++;

}
System.out.println("Done collecting");

count = 0;

while(count < 5) {
	System.out.print(" " + scores[count]);
count++;
}


}
}