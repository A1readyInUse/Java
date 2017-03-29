package theme.sorting.algorithms;

public class InsertionSorts extends Sorts {
	// 1.
	public void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				boolean isSwapped = false;

				if (arr[j] < arr[j - 1]) {
					isSwapped = swap(arr, j, j - 1);
					printArray(arr);
				}

				if (!isSwapped) {
					break;
				}
			}
		}
	}

	// 2.
	public void shellSort(int[] arr) {

	}

	// 3.
	public void splaySort(int[] arr) {

	}

	// 4.
	public void treeSort(int[] arr) {

	}

	// 5.
	public void librarySort(int[] arr) {

	}

	// 6.
	public void patienceSorting(int[] arr) {

	}
}
