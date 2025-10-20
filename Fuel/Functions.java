public class Functions {
public static String petrolAmount(Double amount) {
	if(amount >= 1000) {
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
	else  
		return("Amount must be above a liter price!!!");
	
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
	if(amount >= 1500) {
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
	else  
		return("Amount must be above a liter price!!!");
	
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
	if(amount >= 1200) {
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
	else  
		return("Amount must be above a liter price!!!");
	
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
	if(amount >= 1800) {
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
	else  
		return("Amount must be above a liter price!!!");
	
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