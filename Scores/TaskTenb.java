import java.util.Scanner;

public class TaskTenb {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int count = 0;
int[] scores = new int[10];
double sum = 0.0;

while(count < 10) {
System.out.print("Enter a student's score: ");
int score = input.nextInt();
scores[count] = score;
count++;

if(score < 0 | score > 100) {
System.out.println("Invalid score!");
}

if(score >= 0 & score <= 100) {
sum += score;
}

}
double average = sum / count;
System.out.print("The sum of the valid scores is: " + average);
}
}
