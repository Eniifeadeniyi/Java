import java.util.Scanner;

public class TaskTwo {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int count = 0;
int[] scores = new int[10];
double sum = 0.0;

while(count < 10) {
System.out.print("Enter student's score: ");
scores[count] = input.nextInt();
sum += scores[count];
count++;
}
double average = sum / count;
System.out.print("The average of the scores is: " + average);
}
}