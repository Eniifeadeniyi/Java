package ValidateCreditCard;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFunctions {

	@Test
	void testThatCheckCardTypeWorks() {
		String actual = Functions.checkCardType("3788576018402626");
		String expected = "American Express Card";
		assertEquals(actual,expected);
	}

	@Test
	void testForInvalidCardType(){
		String actual = Functions.checkCardType("9388576018402626");
		String expected = "Invalid";
		assertEquals(actual,expected);
	}

	@Test
	void testCheckCardNumberLength() {
		String actual = Functions.checkCardNumberLength("3788576018402626");
		String expected = "Valid";
		assertEquals(actual,expected);
	}

	@Test
	void testForInvalidCardNumberLength() {
		String actual = Functions.checkCardNumberLength("37885760184026260");
		String expected = "Invalid";
		assertEquals(actual,expected);
	}

	@Test
	void testDoubleEverySecondDigit(){
		int actual = Functions.doubleEverySecondDigit("4388576018402626");
		int expected = 37;
		assertEquals(actual,expected);
	}

	@Test
	void testDoubleOtherDigits() {
		int actual = Functions.doubleOtherDigits("4388576018402626");
		int expected = 38;
		assertEquals(actual,expected);
	}

	@Test
	void testSumBothSums(){
		int actual = Functions.sumBothSums("4388576018402626");
		int expected = 75;
		assertEquals(actual,expected);
	}

	@Test
	void testCheckValidityOfBothSums(){
		String actual = Functions.checkValidityOfBothSums("4388576018402626");
		String expected = "Invalid";
		assertEquals(actual,expected);
	}


	@Test
	void testCheckValidityOfBothSumsAgain(){
		String actual = Functions.checkValidityOfBothSums("4388576018410707");
		String expected = "Valid";
		assertEquals(actual,expected);
	}



}


	