package theme.sorting.algorithms;

public class MergeSorts extends Sorts {
	public static void main(String[] args) {
		MergeSorts ms = new MergeSorts();
		int[] arr = ms.initArray();
		arr = ms.mergeSort(arr);
	}

	public MergeSorts() {
		super(16);
	}

	public MergeSorts(int size) {
		super(size);
	}

	// 1.
	// public void AAAAA(int[] arr) {
	// }

	// 2.
	public void cascadeMergeSort(int[] arr) {

	}

	// 3.
	public void oscillatingMergeSort(int[] arr) {

	}

	// 4.
	public void polyphaseMergeSort(int[] arr) {

	}

	// private
	public int[] mergeSort(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}

		int size1st = 1, size2nd = 1;

		if (arr.length == 2) {
			int[] first = new int[size1st];
			int[] second = new int[size2nd];
			System.arraycopy(arr, 0, first, 0, size1st);
			System.arraycopy(arr, 1, second, 0, size2nd);

			arr = merge2Arrays(first, second);
		}

		if (arr.length > 2) {
			if (arr.length % 2 == ODD) {
				size1st = arr.length / 2 + 1;
			} else if (arr.length % 2 == EVEN) {
				size1st = arr.length / 2;
			}
			size2nd = arr.length - size1st;

			int[] first = new int[size1st];
			int[] second = new int[size2nd];
			System.arraycopy(arr, 0, first, 0, size1st);
			System.arraycopy(arr, size1st, second, 0, size2nd);

			first = mergeSort(first);
			second = mergeSort(second);
			arr = merge2Arrays(first, second);
			printArray(arr);
		}

		return arr;
	}

	private int[] merge2Arrays(int[] arr1st, int[] arr2nd) {
		int size = arr1st.length + arr2nd.length;
		int[] newArr = new int[size];

		int idx1st = 0, idx2nd = 0;
		int idxNew = 0;

		// compare values, fill those in new
		while (idx1st < arr1st.length && idx2nd < arr2nd.length) {
			if (arr1st[idx1st] <= arr2nd[idx2nd]) {
				newArr[idxNew] = arr1st[idx1st++];
			} else if (arr2nd[idx2nd] <= arr1st[idx1st]) {
				newArr[idxNew] = arr2nd[idx2nd++];
			}
			idxNew++;
		}

		// after finishing an array, fill the rest
		for (int j = idxNew; j < newArr.length; j++) {
			if (idx1st >= arr1st.length) {
				newArr[j] = arr2nd[idx2nd++];
			} else if (idx2nd >= arr2nd.length) {
				newArr[j] = arr1st[idx1st++];
			}
		}

		return newArr;
	}
}