package Problems;

public class Problem {
	private String nameOfProblem;
	private String typeOfProblem;
	private boolean isSolved;
	

String[] validProblemTypes = {"Spiritual", "Education", "Business", "Technical", "Financial"};

public String getNameOfProblem() {
	return nameOfProblem;
}

public  Problem(String name, String type) {
	for(String valid : validProblemTypes)	{
        if (type.equalsIgnoreCase(valid)) {
            nameOfProblem = name;
            this.typeOfProblem = type;
            break;
        }
    }
}

public String getTypeOfProblem() {
	return typeOfProblem;
}

public void setProblemStatus(Boolean status) {
	this.isSolved = status; 
}

public boolean getProblemStatus() {
	return isSolved;
}

}