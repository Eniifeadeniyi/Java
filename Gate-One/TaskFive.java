public class TaskFive {
public static void main(String[] args) {

int number = 0;
while(number <= 9) {
number += 1;
if(number % 4 == 0) {
System.out.printf("%d %d %d %d %d%n", number, number, number, number, number );
if(number % 4 != 0) {
number += 1;
}
}
}
}
}