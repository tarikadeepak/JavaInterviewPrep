package coding.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BinarySearch {
	boolean binarySearch(int[] integerArray, int n) {
		Arrays.parallelSort(integerArray);
		int arrayLength = integerArray.length;
		if(arrayLength == 0)
			return false;
		int middleElementIndex = arrayLength/2;
		if(n == integerArray[middleElementIndex])
			return true;
		if(n > integerArray[middleElementIndex]) {
			int[] partialArray = IntStream.range(middleElementIndex + 1, arrayLength).map(i -> integerArray[i]).toArray(); 
			return binarySearch(partialArray,n);
		}else {
			int[] partialArray = IntStream.range(0, middleElementIndex).map(i->integerArray[i]).toArray();
			return binarySearch(partialArray, n);
//			return binarySearch(Arrays.copyOfRange(integerArray, 0, middleElementIndex), n);
		}

	}

}
