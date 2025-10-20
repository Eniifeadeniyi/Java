public class Functions {
public static String petrolAmount(Double amount) {
	if(amount >= 1000 & amount <= 50000) {
		Double numberOfLitres = amount / 1000;
		String receipt = String.format("""
		Customers Transaction Receipt
		=========================================================
		=	Product : Petrol       				=
		=	Amount : #%.2f    				=
		=	Liters : %.2fL		   			=
		=	Thanks for patronizing Eniife's Station 	=
		=		Hope to see you again!			=
		=========================================================
		Saving Transaction History...
		""",amount, numberOfLitres);
		return receipt;
		}
	if(amount < 1000) 
		return("Amount must be above a liter price!!!");
	if(amount > 50000) 
		return("Amount must be less than the price of 50liters!!!");
return null;	
}


public static String petrolLiter(Double numberOfLitres) {
	if(numberOfLitres >= 1 & numberOfLitres <= 50) {
		Double amount = numberOfLitres * 1000;
		String receipt = String.format("""
		Customers Transaction Receipt
		=========================================================
		=	Product : Petrol       				=
		=	Amount : #%.2f    				=
		=	Liters : %.2fL		   			=
		=	Thanks for patronizing Eniife's Station 	=
		=		Hope to see you again!			=
		=========================================================
		Saving Transaction History...
		""",amount, numberOfLitres);
		return receipt;
		}
	else  
		return("Liters must be between 1 - 50");
	
}
public static String dieselAmount(Double amount) {
	if(amount >= 1500 & amount <= 75000) {
		Double numberOfLitres = amount / 1500;
		String receipt = String.format("""
		Customers Transaction Receipt
		=========================================================
		=	Product : Petrol       				=
		=	Amount : #%.2f    				=
		=	Liters : %.2fL		   			=
		=	Thanks for patronizing Eniife's Station 	=
		=		Hope to see you again!			=
		=========================================================
		Saving Transaction History...
		""",amount, numberOfLitres);
		return receipt;
		}
	if(amount < 1500) 
		return("Amount must be above a liter price!!!");
	if(amount > 75000) 
		return("Amount must be less than the price of 50liters!!!");
return null;	
}


public static String dieselLiter(Double numberOfLitres) {
	if(numberOfLitres >= 1 & numberOfLitres <= 50) {
		Double amount = numberOfLitres * 1500;
		String receipt = String.format("""
		Customers Transaction Receipt
		=========================================================
		=	Product : Petrol       				=
		=	Amount : #%.2f    				=
		=	Liters : %.2fL		   			=
		=	Thanks for patronizing Eniife's Station 	=
		=		Hope to see you again!			=
		=========================================================
		Saving Transaction History...
		""",amount, numberOfLitres);
		return receipt;
		}
	else  
		return("Liters must be between 1 - 50");
	
}

public static String keroseneAmount(Double amount) {
	if(amount >= 1200 & amount <= 60000) {
		Double numberOfLitres = amount / 1200;
		String receipt = String.format("""
		Customers Transaction Receipt
		=========================================================
		=	Product : Petrol       				=
		=	Amount : #%.2f    				=
		=	Liters : %.2fL		   			=
		=	Thanks for patronizing Eniife's Station 	=
		=		Hope to see you again!			=
		=========================================================
		Saving Transaction History...
		""",amount, numberOfLitres);
		return receipt;
		}
	if(amount < 1200) 
		return("Amount must be above a liter price!!!");
	if(amount > 60000) 
		return("Amount must be less than the price of 50liters!!!");
return null;	
}


public static String keroseneLiter(Double numberOfLitres) {
	if(numberOfLitres >= 1 & numberOfLitres <= 50) {
		Double amount = numberOfLitres * 1200;
		String receipt = String.format("""
		Customers Transaction Receipt
		=========================================================
		=	Product : Petrol       				=
		=	Amount : #%.2f    				=
		=	Liters : %.2fL		   			=
		=	Thanks for patronizing Eniife's Station 	=
		=		Hope to see you again!			=
		=========================================================
		Saving Transaction History...
		""",amount, numberOfLitres);
		return receipt;
		}
	else  
		return("Liters must be between 1 - 50");
	
}

public static String gasAmount(Double amount) {
	if(amount >= 1800 & amount <= 90000) {
		Double numberOfLitres = amount / 1800;
		String receipt = String.format("""
		Customers Transaction Receipt
		=========================================================
		=	Product : Petrol       				=
		=	Amount : #%.2f    				=
		=	Liters : %.2fL		   			=
		=	Thanks for patronizing Eniife's Station 	=
		=		Hope to see you again!			=
		=========================================================
		Saving Transaction History...
		""",amount, numberOfLitres);
		return receipt;
		}

	if(amount < 1800) 
		return("Amount must be above a liter price!!!");
	if(amount > 90000) 
		return("Amount must be less than the price of 50liters!!!");
return null;	
}


public static String gasLiter(Double numberOfLitres) {
	if(numberOfLitres >= 1 & numberOfLitres <= 50) {
		Double amount = numberOfLitres * 1800;
		String receipt = String.format("""
		Customers Transaction Receipt
		=========================================================
		=	Product : Petrol       				=
		=	Amount : #%.2f    				=
		=	Liters : %.2fL		   			=
		=	Thanks for patronizing Eniife's Station 	=
		=		Hope to see you again!			=
		=========================================================
		Saving Transaction History...
		""",amount, numberOfLitres);
		return receipt;
		}
	else  
		return("Liters must be between 1 - 50");
	
}

}