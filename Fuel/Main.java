package Fuel;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);


ArrayList<String> receipts = new ArrayList<String>();

String operation = ""; 
while(!operation.equals("3")) {
System.out.println("Welcome to Eniife's Station!");
String main = """
	1. Buy Petroleum
	2. Show Transaction History
	3. Exit
Enter operation:
	""";

System.out.print(main);
operation = input.next();
switch(operation) {
	case "2" -> {
		if(!receipts.isEmpty()) System.out.println(receipts);
		if(receipts.isEmpty()) System.out.println("No purchases made yet!");
			}
	case "3" -> System.out.print("See you next time!");
	default -> System.out.println("Invalid input!");
	case "1" -> {
		String menu = """
			Petroleum Options:
		1. Petrol => #1000/liter
		2. Diesel => #1500/liter
		3. Kerosene => #1200/liter
		4. Gas => #1800/liter
	Enter operation: 
			""";

		System.out.print(menu);
		String option = input.next();

		switch (option) {
			case "1" -> {
				    System.out.print("Liter or Amount: ");
				    String choice = input.next().toLowerCase();
					switch (choice) {
						case "amount" -> {
								System.out.print("How much Petrol are you buying(1000/L): ");
								Double amount = input.nextDouble();
								String receipt = Functions.petrolAmount(amount);
								receipts.add(receipt);
								System.out.print(receipt);
								}

						case "liter" -> {
								System.out.print("How many liters of Petrol are you buying(1000/L): ");
								Double liter = input.nextDouble();
								String receipt = Functions.petrolLiter(liter);
								receipts.add(receipt);
								System.out.print(receipt);
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
								String receipt = Functions.dieselAmount(amount);
								receipts.add(receipt);
								System.out.print(receipt);
								}
	
						case "liter" -> {
								System.out.print("How many liters of Diesel are you buying(1500/L): ");
								Double liter = input.nextDouble();
								String receipt = Functions.dieselLiter(liter);
								receipts.add(receipt);
								System.out.print(receipt);
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
								String receipt = Functions.keroseneAmount(amount);
								receipts.add(receipt);
								System.out.print(receipt);
								}
		
						case "liter" -> {
								System.out.print("How many liters of Kerosene are you buying(1200/L): ");
								Double liter = input.nextDouble();
								String receipt = Functions.keroseneLiter(liter);
								receipts.add(receipt);
								System.out.print(receipt);
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
								String receipt = Functions.gasAmount(amount);
								receipts.add(receipt);
								System.out.print(receipt);
								}
		
						case "liter" -> {
								System.out.print("How many liters of Gas are you buying(1800/L): ");
								Double liter = input.nextDouble();
								String receipt = Functions.gasLiter(liter);
								receipts.add(receipt);
								System.out.print(receipt);
								}
	
							}
					}

			default -> System.out.println("Invalid input!");

				}
		
			}
		}
	
}


}
}