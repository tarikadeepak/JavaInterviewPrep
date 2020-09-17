package coding.interview.sorting;

public class QuickSort {
	void quickSort(int[] intArray, int low, int high) {
		if(low > high) {
			return;
		}
		int index = partition(intArray, low, high);
		quickSort(intArray, low, index-1);
		quickSort(intArray, index+1, high);
	}
	
	int partition(int [] intArray, int low, int high) {
		int pivot = intArray[high];
		int swapIndex = low-1;
		for(int i=low; i<high;i++) {
			if(intArray[i] < pivot) {
				swapIndex++;
				int temp = intArray[i];
				intArray[i] = intArray[swapIndex];
				intArray[swapIndex] = temp;
			}
		}
		int temp = pivot;
		intArray[high] = intArray[swapIndex + 1];
		intArray[swapIndex + 1] = temp;
		return (swapIndex + 1);
	}
}
