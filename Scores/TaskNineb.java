import java.util.Scanner;

public class TaskNineb {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int count = 0;
int[] scores = new int[10];
int sum = 0;

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

System.out.print("The sum of the valid scores is: " + sum);
}
}
