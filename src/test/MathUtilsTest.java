package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	public void testAdd() {
		MathUtils test = new MathUtils();
		int result = test.add(4, 2);
		assertEquals(6, result);
	}
	
	@Test
	public void testSubtract() {
		MathUtils test = new MathUtils();
		int result = test.subtract(4, 2);
		assertEquals(2, result);
	}
	
	@Test
	public void testMultiply() {
		MathUtils test = new MathUtils();
		int result = test.multiply(4, 2);
		assertEquals(8, result);
		
	}
	@Test
	public void testDivide() {
		MathUtils test = new MathUtils();
		double result = test.divide(4, 2);
		assertEquals(2, result);
		
	}

}
