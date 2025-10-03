public class DivideOrSquare {
public static void main(String[] args) {

System.out.print(divideorsquare(10));
}

public static double divideorsquare(double number) {
	if(number % 5 == 0) {		
		return Math.pow(number * 1.0, 0.5);
	if(number % 5 != 0) {	
		return (number * 1.0) % 5; }
}

}
}