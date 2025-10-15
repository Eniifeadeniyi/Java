public class MultiplicationTable {
public static void main(String[] args) {

int number = 2;
for(int count = 0; count <= 12; count++) {
	int answer = number * count;
	System.out.println(number + " times " + count + " is " + answer);
}

}
}