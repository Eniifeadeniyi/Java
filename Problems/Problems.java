import java.util.ArrayList;
public class Problems {
	private String nameOfProblem;
	private String typeOfProblem;
	private String[] wahalas;
	private ArrayList<String[]> problems;


public void setNameOfProblem(String name) {
	this.nameOfProblem = name;
}

public String getNameOfProblem() {
	return nameOfProblem;
}


public void setTypeOfProblem(String type) {
	this.typeOfProblem = name;
}

public String getTypeOfProblem() {
	return typeOfProblem;
}

public String[] addToWahalas(String nameOfProblem, String typeOfProblem) {
	wahalas = new String[2];
	wahalas[0] = nameOfProblem;
	wahalas[1] = typeOfProblem;
	return wahalas;
}

public ArrayList<String[]> addToProblems(String[] wahalas) {
	problems = new ArrayList<>();
	problems.add(wahalas);
	return problems;
}

public boolean isSolved(String answer) {
	if(answer.equalsIgnoreCase("yes")) return true;
	return false;
}

public 

}