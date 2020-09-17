package coding.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringPalindromeTest {

	@Test
	public void test() {
		StringPalindrome strPalindrome = new StringPalindrome();
		assertTrue(strPalindrome.isPalindrome("bob"));
		assertFalse(strPalindrome.isPalindrome("yes"));
		assertTrue(strPalindrome.isPalindrome("deed"));
	}

}
