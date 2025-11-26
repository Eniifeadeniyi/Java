import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

String choice = ""; 
while(!choice.equalsIgnoreCase("done")) {
Problems problem = new Problems();
System.out.print("Enter a problem name or type 'done' to finish: ");
if(input.hasNextLine()) {
	choice = input.nextLine();
	if(!choice.equalsIgnoreCase("done")) {
	problem.setNameOfProblem(choice);
	}
	System.out.print("Enter problem type(Spiritual, Education, Business, Technical, Financial): ");
	if(input.hasNext()) {
		String type = input.next();
		problem.setTypeOfProblem(type);
		System.out.println(problem.getNameOfProblem());
		System.out.println(problem.getTypeOfProblem());
		System.out.println(problem.getProblemStatus());}

}
input.nextLine();
}

}
}