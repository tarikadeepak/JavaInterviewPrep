package coding.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerPalindromeTest {

	@Test
	public void test() {
		IntegerPalindrome intPalindrome = new IntegerPalindrome();
		assertTrue(intPalindrome.isIntegerPalindrome(1331));
		assertTrue(intPalindrome.isIntegerPalindrome(1432341));
		assertFalse(intPalindrome.isIntegerPalindrome(137));
	}

}
