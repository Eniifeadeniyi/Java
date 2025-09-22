import java.util.Scanner;

public class TwoTwentyFour {
   public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int p = input.nextInt();


System.out.print("Enter second integer: ");
int q = input.nextInt();


System.out.print("Enter third integer: ");
int r = input.nextInt();


System.out.print("Enter fourth integer: ");
int s = input.nextInt();


System.out.print("Enter fifth integer: ");
int t = input.nextInt();

int min = p;
if(q < min){
min=q;
}
if(r < min){
min=r;
}
if(s < min){
min=s;
}
if(t < min){
min=t;
}
System.out.printf("The smallest number is: %d%n", min);

int max = p;
if(q > max) {
max = q;
}


if(r > max) {
max = r;
}


if(s > max) {
max = s;
}


if(t > max) {
max = t;
}

System.out.printf("The largest number is: %d", max);


}
}



