import java.util.Scanner;

public class Main { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Welcome to Eniife's Station!");

String menu = """
	Petroleum Options:
1. Petrol => #1000/liter
2. Diesel => #1500/liter
3. Kerosene => #1200/liter
4. Gas => #1800/liter
""";

System.out.print(menu);

System.out.print("Enter operation: ");
String option = input.next();



switch (option) {
	case "1" -> {
		    System.out.print("Liter or Amount: ");
		    String choice = input.next().toLowerCase();
			switch (choice) {
				case "amount" -> {
					System.out.print("How much Petrol are you buying(1000/L): ");
					Double amount = input.nextDouble();
					System.out.print(Functions.petrolAmount(amount));
					}

				case "liter" -> {
					System.out.print("How many liters of Petrol are you buying(1000/L): ");
					Double liter = input.nextDouble();
					System.out.print(Functions.petrolLiter(liter));
					}


			}
		}
	case "2" -> {
		    System.out.print("Liter or Amount: ");
		    String choice = input.next().toLowerCase();
			switch (choice) {
				case "amount" -> {
					System.out.print("How much Diesel are you buying(1500/L): ");
					Double amount = input.nextDouble();
					System.out.print(Functions.dieselAmount(amount));
					}

				case "liter" -> {
					System.out.print("How many liters of Diesel are you buying(1500/L): ");
					Double liter = input.nextDouble();
					System.out.print(Functions.dieselLiter(liter));
					}


			}
		}

	case "3" -> {
		    System.out.print("Liter or Amount: ");
		    String choice = input.next().toLowerCase();
			switch (choice) {
				case "amount" -> {
					System.out.print("How much Kerosene are you buying(1200/L): ");
					Double amount = input.nextDouble();
					System.out.print(Functions.keroseneAmount(amount));
					}

				case "liter" -> {
					System.out.print("How many liters of Kerosene are you buying(1200/L): ");
					Double liter = input.nextDouble();
					System.out.print(Functions.keroseneLiter(liter));
					}


			}
		}
	case "4" -> {
		    System.out.print("Liter or Amount: ");
		    String choice = input.next().toLowerCase();
			switch (choice) {
				case "amount" -> {
					System.out.print("How much Gas are you buying(1800/L): ");
					Double amount = input.nextDouble();
					System.out.print(Functions.gasAmount(amount));
					}

				case "liter" -> {
					System.out.print("How many liters of Gas are you buying(1800/L): ");
					Double liter = input.nextDouble();
					System.out.print(Functions.gasLiter(liter));
					}


			}
		}

	default -> System.out.print("Invalid input!");

	}



}
}