package coding.interview;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinarySearchTest {
	@Test
	public void Test() {
		BinarySearch binarySearch = new BinarySearch();
		int[] integerArray = {1,2,4,5,7};
		assertTrue(binarySearch.binarySearch(integerArray, 2));	
		assertTrue(binarySearch.binarySearch(integerArray, 5));
		assertFalse(binarySearch.binarySearch(integerArray, 3));
	}
}
