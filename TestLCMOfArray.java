import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLCMOfArray{

	@Test
	void testFindLCM() {
		int actual = LCMOfArray.findLCM(new int[] {2,10,5,15,20});
		int expected = 60;
		assertEquals(actual,expected);
	}
	

}
