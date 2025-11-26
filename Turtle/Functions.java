public class Functions {

int[][] floor = new int[20][20];
boolean penDown = false;

public boolean draw(String c=ommand) {
	if(command.equals("2")) penDown = true;
	return pendown;
}

public int[][] moveForward(String command) {
	for(int count = 0; count < 20; count++) {
		for(int counter = 0; counter < Integer.parseInt(command); counter++) {
			if(penDown == true) floor[count][counter] = 1;}}
	

}