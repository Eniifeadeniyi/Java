public class Problems {
	private String nameOfProblem;
	private String typeOfProblem;
	private boolean isSolved;
	

String[] validProblemTypes = {"Spiritual", "Education", "Business", "Technical", "Financial"};

public void setNameOfProblem(String name) {
	this.nameOfProblem = name;
}

public String getNameOfProblem() {
	return nameOfProblem;
}

public void setTypeOfProblem(String type) {
	for(String valid : validProblemTypes)	{
		if(type.equalsIgnoreCase(valid)) this.typeOfProblem = type;}
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