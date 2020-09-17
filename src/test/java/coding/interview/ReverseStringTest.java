package coding.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString revereseString = new ReverseString();
		assertTrue((revereseString.reverseString("deepak")).equals("kapeed"));
		assertTrue((revereseString.reverseString("divya")).equals("ayvid"));
	}

}
