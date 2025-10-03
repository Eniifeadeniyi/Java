public class MyDiscount {
public static void main(String[] args) {

System.out.print(mydiscount(150,0.15));
}


public static double mydiscount(double price, double discount) {
	double discountedprice = (price) - (discount * price);
	return discountedprice;

}
}