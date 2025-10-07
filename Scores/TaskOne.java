import java.util.Scanner;

public class TaskOne {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int count = 0;
int[] scores = new int[10];
int sum = 0;

while(count < 10) {
System.out.print("Enter student's score: ");
scores[count] = input.nextInt();
sum += scores[count];
count++;
}
System.out.print("The sum of the scores is: " + sum);
}
}