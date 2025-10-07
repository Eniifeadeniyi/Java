import java.util.Scanner;

public class TaskTen {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int count = 0;
int[] scores = new int[10];
double sum = 0;

while(count < 10) {
System.out.print("Enter student's score: ");
int score = input.nextInt();

if(score >= 0 & score <= 100) {
scores[count] = score;
sum += score;
count++;
}

if(score < 0 | score > 100) {
System.out.println("Invalid input!");
}

}
double average = sum / count;
System.out.println("The average of the valid scores is: " + average);
}
}