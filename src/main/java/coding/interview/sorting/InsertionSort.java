package coding.interview.sorting;

public class InsertionSort {
	void insertionSort(int[] arr) {
		int currentValue;
		for(int i=0; i<arr.length; i++) {
			currentValue=arr[i];
				int j=i-1;
				while(j>=0 && arr[j] > currentValue) {
					arr[j+1] = arr[j];
					j--;
				}
				arr[j+1] = currentValue;		}
	}
}
