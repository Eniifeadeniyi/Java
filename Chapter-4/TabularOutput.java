public class TabularOutput {
public static void main(String[] args) {

System.out.println("N  N^2  N^3  N^4");

int number = 1;

while(number <= 5){
int square = number * number;
int cube = number * number * number;
int powerfour = number * number * number * number;
System.out.printf("%d  %d   %d    %d%n", number, square, cube, powerfour);
number += 1;
}
}
}
