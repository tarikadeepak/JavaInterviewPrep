package coding.interview.sorting;

import org.junit.Test;

public class QuickSortTest {
	@Test
	public void Test() {
		QuickSort qs = new QuickSort();
		int [] intArray = {10, 7, 8, 9, 1, 5};
		qs.quickSort(intArray, 0, intArray.length -1);
		for(int intArrayElement : intArray) {
			System.out.println(intArrayElement);
		}
	}
}
