public class SumDigits {
public static void main(String[] args) {

int number = 12345;
int[] numbers = {1,2,3,4,5};

int sum = 0;
int count = 0; 
while(count < numbers.length) {
sum += numbers[count];
count++;
}

System.out.print(sum);
}
}