public class PizzaWahalaFunctions{
public static int getNumberOfBoxes(int guests, int slicesPerBox, int pricePerBox) {
	int numberOfBoxes = guests / slicesPerBox;
	if(guests % slicesPerBox != 0) {
		numberOfBoxes += 1;
	}

	return numberOfBoxes;
}
public static int getTotal(int guests, int slicesPerBox, int pricePerBox) {
	int numberOfBoxes = guests / slicesPerBox;
	if(guests % slicesPerBox != 0) {
		numberOfBoxes += 1;
	}

	int numberOfSlices = numberOfBoxes * slicesPerBox;
	if(numberOfSlices > guests) {
		int extra = numberOfSlices - guests;
	}
	
	int total = pricePerBox * numberOfBoxes;

	return total;
}

public static int getExtra(int guests, int slicesPerBox, int pricePerBox) {
	int numberOfBoxes = guests / slicesPerBox;
	if(guests % slicesPerBox != 0) {
		numberOfBoxes += 1;
	}

	int numberOfSlices = numberOfBoxes * slicesPerBox;
	if(numberOfSlices > guests) {
		int extra = numberOfSlices - guests;
		return extra;
	}
return 0;	
}

}