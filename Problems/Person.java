package Problems;

import java.util.ArrayList;

public class Person {
	private ArrayList<Problem> problems = new ArrayList<>();

public void addToProblemsArrayList(String problemName, String problemType) {
	Problem problem = new Problem(problemName, problemType);
	problems.add(problem);
}

}