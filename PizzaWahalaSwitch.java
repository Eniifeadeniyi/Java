import java.util.Scanner;

public class PizzaWahalaSwitch {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

   System.out.print("Enter number of guests you are expecting: ");
   int guests = input.nextInt();

   input.nextLine();
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

  System.out.print("Enter the pizza type you are interested in: ");
   String pizzaType = input.nextLine().toLowerCase();

   switch(pizzaType) {

	case "sapa size" -> {
				int numberOfBoxes = guests / 4;
				if(guests % 4 != 0) {
					numberOfBoxes += 1;
				}

				System.out.println("You will need " + numberOfBoxes + " boxes of the sapa size pizza.");
				int numberOfSlices = numberOfBoxes * 4;

				if(numberOfSlices > guests) {
					int extra = numberOfSlices - guests;
					System.out.println(extra + " slices will be remanining after serving.");
				}

				int total = 2500 * numberOfBoxes;
				System.out.print("Your total charge is ₦" + total);
			}

	case "small money" -> {
				int numberOfBoxes = guests / 6;
				if(guests % 6 != 0) {
					numberOfBoxes += 1;
				}

				System.out.println("You will need " + numberOfBoxes + " boxes of the small money pizza.");
				int numberOfSlices = numberOfBoxes * 6;

				if(numberOfSlices > guests) {
					int extra = numberOfSlices - guests;
					System.out.println(extra + " slices will be remanining after serving.");
				}

				int total = 2900 * numberOfBoxes;
				System.out.print("Your total charge is ₦" + total);
			}


	case "big boys" -> {
				int numberOfBoxes = guests / 8;
				if(guests % 8 != 0) {
					numberOfBoxes += 1;
				}
				
				System.out.println("You will need " + numberOfBoxes + " boxes of the big boys pizza.");
				int numberOfSlices = numberOfBoxes * 8;

				if(numberOfSlices > guests) {
					int extra = numberOfSlices - guests;
					System.out.println(extra + " slices will be remanining after serving.");
				}

				int total = 4000 * numberOfBoxes;
				System.out.print("Your total charge is ₦" + total);
			}

	case "odogwu" -> {
				int numberOfBoxes = guests / 12;
				if(guests % 12 != 0) {
					numberOfBoxes += 1;
				}
		
				System.out.println("You will need " + numberOfBoxes + " boxes of the odogwu pizza.");
				int numberOfSlices = numberOfBoxes * 12;

				if(numberOfSlices > guests) {
					int extra = numberOfSlices - guests;
					System.out.println(extra + " slices will be remanining after serving.");
				}

				int total = 5200 * numberOfBoxes;
				System.out.print("Your total charge is ₦" + total);
			}


		}
	}
}