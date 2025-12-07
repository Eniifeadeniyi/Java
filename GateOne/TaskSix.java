public class TaskSix {
public static void main(String[] args) {

int number = 0;
while(number <= 9) {
number += 1;
if(number % 4 == 0) {
int square = number * number;
int cube = number * number * number;
int powerfour = number * number * number * number;
int powerfive = number * number * number * number * number;
System.out.printf("%d %d %d %d %d%n", number, square, cube, powerfour, powerfive);
if(number % 4 != 0) {
number += 1;
}
}
}
}
}