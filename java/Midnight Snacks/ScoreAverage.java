/* Declare a variable, first_student.
 Declare a variable, second_student.
 Declare a variable, third_student.
 Ask user to type in first student's score, and assign the input to first_student.
 Ask user to type in second student's score, and assign the input to second_student.
 Ask user to type in third student's score, and assign the input to third_student.
 Declare a variable, average.
 Assign the value of the average of the three scores to average.
 Check if average is within the range of 90 to 100, if it is, print:The class average grade is an A.
 Check if average is within the range of 80 to 89, if it is, print:The class average grade is an B.
 Check if average is within the range of 70 to 79, if it is, print:The class average grade is an C.
 Check if average is within the range of 60 to 69, if it is, print:The class average grade is an D.
 Check if average is within the range of 0 to 59, if it is, print:The class average grade is an F.
*/


import java.util.Scanner;

public class ScoreAverage {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 

System.out.print("Enter first student's score: ");
int firststudent = input.nextInt();

System.out.print("Enter second student's score: ");
int secondstudent = input.nextInt();

System.out.print("Enter third student's score: ");
int thirdstudent = input.nextInt();

double average = (firststudent + secondstudent + thirdstudent) / 3;

if(average >= 90 & average <= 100) {
System.out.print("The class average grade is an A");
}
if(average >= 80 & average < 90) {
System.out.print("The class average grade is a B");
}
if(average >= 70 & average < 80) {
System.out.print("The class average grade is a C");
}
if(average >= 60 & average < 70) {
System.out.print("The class average grade is a D");
}
if(average >= 0 & average < 60) {
System.out.print("The class average grade is an F");
}



}
}