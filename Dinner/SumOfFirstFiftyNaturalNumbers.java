public class SumOfFirstFiftyNaturalNumbers {
public static void main(String[] args) {

int sum = 0;
for(int count = 1; count <= 50; count += 1) {
	sum += count;
}
System.out.print(sum);
}
}