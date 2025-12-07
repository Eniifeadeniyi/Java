package Scores;
import java.util.Scanner;

public class TaskEight {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int count = 0;
int[] scores = new int[10];
int sum = 0;

while(count < 10) {
System.out.print("Enter student's score: ");
int score = input.nextInt();

if(score >= 0 & score <= 100) {
scores[count] = score;
count++;
}

if(score < 0 | score > 100) {
System.out.println("Invalid input!");
}
sum += score;

}
System.out.println("The sum of the scores is: " + sum);
}
}