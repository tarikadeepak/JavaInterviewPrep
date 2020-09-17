package coding.interview.sorting;

import org.junit.Test;

public class InsertionSortTest {
	@Test
	public void Test() {
		InsertionSort is = new InsertionSort();
		int [] intArray = {10, 7, 8, 9, 1, 5};
		is.insertionSort(intArray);
		for(int intArrayElement : intArray) {
			System.out.println(intArrayElement);
		}
	}
}
