package theme.sorting.algorithms;

public class MergeSorts extends Sorts {
	public static void main(String[] args) {
		MergeSorts ms = new MergeSorts();
		ms.mergeSort(arr);
	}

	//
	public MergeSorts() {
		super();
	}

	public MergeSorts(int size) {
		super(size);
	}

	// 1.
	public int[] mergeSort(int[] arr) {
		if (arr.length < 2) {
			return arr;
		}

		// 1.1. initialize
		int size1st = 1, size2nd = 1;

		if (arr.length % 2 == ODD) {
			size1st = arr.length / 2 + 1;
		} else if (arr.length % 2 == EVEN) {
			size1st = arr.length / 2;
		}
		size2nd = arr.length - size1st;

		// 1.2. devide
		int[] first = new int[size1st];
		int[] second = new int[size2nd];

		System.arraycopy(arr, 0, first, 0, size1st);
		System.arraycopy(arr, size1st, second, 0, size2nd);

		first = mergeSort(first);
		second = mergeSort(second);

		// 1.3. merge
		return merge2Arrays(first, second);
	}

	// 2.
	public void cascadeMergeSort(int[] arr) {

	}

	// 3.
	public void oscillatingMergeSort(int[] arr) {

	}

	// 4.
	public void polyphaseMergeSort(int[] arr) {

	}
}
