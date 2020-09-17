package coding.interview;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class StringAnagramTest {
	@Test
	public void Test() {
		StringAnagram  strAnagram = new StringAnagram();
		assertTrue(strAnagram.isStringAnagram("army", "mary"));
		assertFalse(strAnagram.isStringAnagram("army", "mari"));
	}

}
