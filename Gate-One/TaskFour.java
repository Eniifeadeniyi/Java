public class TaskFour {
public static void main(String[] args) {

int number = 0;
while(number <= 9) {
number += 1;
if(number % 4 == 0) {
System.out.println(number);
if(number % 4 != 0) {
number += 1;
}
}
}
}
}