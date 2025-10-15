public class MultiplesOfSeven {
public static void main(String[] args) {

int counter = 0;
for(int count = 1; count <= 100; count += 1) {
	if(count % 7 == 0) counter += 1;
	
}
System.out.println(counter);
}
}