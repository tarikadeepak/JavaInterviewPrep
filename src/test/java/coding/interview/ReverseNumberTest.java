package coding.interview;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReverseNumberTest {
	@Test
	public void test() {
		ReverseNumber reverseNum = new ReverseNumber();
		assertTrue(reverseNum.revereseNum(123) == 321);
		assertTrue(reverseNum.revereseNum(12332) == 23321);
		char a='a';
		System.out.println("A " + a);
		System.out.println("A String " + Character.toString(a));
	}

}
