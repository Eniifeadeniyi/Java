public class FutureInvestmentValue {
public static void main(String[] args) {


System.out.print(amount(1000, 0.12, 4));
}



public static double amount(double investmentamount, double monthlyinterestrate, int years){
	double futureinvestmentvalue = investmentamount * Math.pow(1 + monthlyinterestrate, years * 12);
	return futureinvestmentvalue;

}
}
