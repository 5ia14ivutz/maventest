package thum.dontmind;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCalculator {
	Calculator test;
	@Test
	public void testSummeOK(){
		test = new Calculator();
		assertTrue(test.addition(1, 1)==2);
	}
	@Test
	public void testNegativeOK(){
		test = new Calculator();
		assertTrue(test.addition(-2, 1)==-1);
	}
	@Test
	public void testFalse(){
		test = new Calculator();
		assertFalse(test.addition(1, 1)==9);
	}
}
