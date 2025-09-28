import java.util.Scanner;
public class CreatingAComparator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int firstnumber = input.nextInt();

System.out.print("Enter another number: ");
int secondnumber = input.nextInt();

if(firstnumber == secondnumber) {
  System.out.print("0");
    }
if(firstnumber > secondnumber) {
  System.out.print("1");
    }
if(firstnumber < secondnumber) {
  System.out.print("-1");
    }

}
}
