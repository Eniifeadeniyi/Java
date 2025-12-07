
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String menu = """
	-------------------------------------------------
	| Pizza Type | Number of slices | Price per box |
	-------------------------------------------------
	| Sapa size  |         4	|      ₦2,500   |
	-------------------------------------------------
	| Small Money|         6        |      ₦2,900   |
	-------------------------------------------------
	| Big boys   |         8	|      ₦4,000   |
	-------------------------------------------------
	| Odogwu     |         12       |      ₦5,200   |
	-------------------------------------------------

""";
System.out.print(menu);


System.out.print("Enter number of guests you are expecting: ");
int guests = input.nextInt();

input.nextLine();

System.out.print("Enter the pizza type you are interested in: ");
String pizzaType = input.nextLine().toLowerCase();



switch(pizzaType) {

	case "sapa size" -> {
				System.out.println("You will need " + PizzaWahalaFunctions.getNumberOfBoxes(guests, 4, 2500) + " boxes of the Sapa size pizza.");
	System.out.println("There will be " + PizzaWahalaFunctions.getExtra(guests, 4, 2500) + " boxes of pizza left over after serving.");
	System.out.print("Your total charge is: " + PizzaWahalaFunctions.getTotal(guests, 4, 2500));
		}

	
	case "small money" -> {
				System.out.println("You will need " + PizzaWahalaFunctions.getNumberOfBoxes(guests, 6, 2900) + " boxes of the Small money pizza.");
	System.out.println("There will be " + PizzaWahalaFunctions.getExtra(guests, 6, 2900) + " boxes of pizza left over after serving.");
	System.out.print("Your total charge is: " + PizzaWahalaFunctions.getTotal(guests, 6, 2900));
		}


	case "big boys" -> {
				System.out.println("You will need " + PizzaWahalaFunctions.getNumberOfBoxes(guests, 8, 4000) + " boxes of the Big boys pizza.");
	System.out.println("There will be " + PizzaWahalaFunctions.getExtra(guests, 8, 4000) + " boxes of pizza left over after serving.");
	System.out.print("Your total charge is: " + PizzaWahalaFunctions.getTotal(guests, 8, 4000));
		}


	case "odogwu" -> {
				System.out.println("You will need " + PizzaWahalaFunctions.getNumberOfBoxes(guests, 12, 5200) + " boxes of the Odogwu pizza.");
	System.out.println("There will be " + PizzaWahalaFunctions.getExtra(guests, 12, 5200) + " boxes of pizza left over after serving.");
	System.out.print("Your total charge is: " + PizzaWahalaFunctions.getTotal(guests, 12, 5200));
		}
	}

}
}