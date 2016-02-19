import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial(int n) {
		MyCalculator calc = new MyCalculator();
		int actual;
		actual = calc.nfactorial(5);
		assertEquals("test", 120, actual);
	}

	@Test
	public void testBinarySearch() {
		//fail("Not yet implemented");
	}

}
