public class ProductOfFirstTenNaturalNumbers {
public static void main(String[] args) {

int product = 1;
for(int count = 1; count <= 10; count += 1) {
	product *= count;
}
System.out.print(product);
}
}