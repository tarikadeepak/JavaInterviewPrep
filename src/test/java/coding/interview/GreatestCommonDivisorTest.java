package coding.interview;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GreatestCommonDivisorTest {
	@Test
	public void Test(){
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		assertTrue(gcd.greatestCommonDivisor(18, 24) == 6);
		assertTrue(gcd.greatestCommonDivisor(24, 18) == 6);
	}
}
