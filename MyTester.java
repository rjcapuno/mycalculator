import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial() {
		long actual;
		MyCalculator calc = new MyCalculator();
		
		actual = calc.nfactorial(1);
		assertEquals("test", 1, actual);
		actual = calc.nfactorial(2);
		assertEquals("test", 2, actual);
		actual = calc.nfactorial(3);
		assertEquals("test", 6, actual);
		actual = calc.nfactorial(4);
		assertEquals("test", 24, actual);
		actual = calc.nfactorial(5);
		assertEquals("test", 120, actual);
	}

	@Test
	public void testBinarySearch() {
		long actual;
		int[] test = new int[5];
		
		test[0] = 1;
		test[1] = 2;
		test[2] = 3;
		test[3] = 4;
		test[4] = 5;
		MyCalculator calc = new MyCalculator();
		
		actual = calc.binarySearch(test, 1);
		assertEquals("test", 0, actual);
		actual = calc.binarySearch(test, 2);
		assertEquals("test", 1, actual);
		actual = calc.binarySearch(test, 3);
		assertEquals("test", 2, actual);
		actual = calc.binarySearch(test, 4);
		assertEquals("test", 3, actual);
		actual = calc.binarySearch(test, 5);
		assertEquals("test", 4, actual);
	}

}
