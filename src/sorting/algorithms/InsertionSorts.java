package sorting.algorithms;

public class InsertionSorts extends Sorts {
	public static void main(String[] args) {
		InsertionSorts is = new InsertionSorts();
		// is.insertionSort(arr);
		is.shellSort(arr);
	}

	//
	public InsertionSorts() {
		super();
	}

	public InsertionSorts(int size) {
		super(size);
	}

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
		final float shrink = 1.3F;
		int gap = (int) (arr.length / shrink);

		while (gap > 0) {
			for (int i = gap; i < arr.length; i++) {
				for (int j = i; j - gap >= 0; j -= gap) {
					boolean isSwapped = false;
					
					if (arr[j - gap] > arr[j]) {
						isSwapped = swap(arr, j, j - gap);
						printArray(arr);
					}
					
					if (!isSwapped) {
						break;
					}
				}
			}
			System.out.println();
			gap /= shrink;
		}
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
