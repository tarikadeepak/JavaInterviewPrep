package coding.interview;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class RemoveDuplicatesFromArrayTest {

	@Test
	public void test() {
		RemoveDuplicatesFromArray removeDups = new RemoveDuplicatesFromArray();
		Character[] charArray = {'a', 'b', 'c', 'a', 'c', 'd', 'b'};
		Set<Character> noDupCharArray = removeDups.removeDuplicatesFromArray(charArray);
		assertTrue(noDupCharArray.size() == 4);
	}

}
