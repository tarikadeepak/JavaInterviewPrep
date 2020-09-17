package coding.interview;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FirstNonRepeatedCharacterTest {
	@Test
	public void test() {
		FirstNonRepeatedCharacter fnrc = new FirstNonRepeatedCharacter();
		assertTrue(fnrc.firstNonRepeatedChar("deepak") == 'd');
		assertTrue(fnrc.firstNonRepeatedChar("deepakd") == 'p');
		assertTrue(fnrc.firstNonRepeatedChar("deeppaakkdf") == 'f');
	}

}
