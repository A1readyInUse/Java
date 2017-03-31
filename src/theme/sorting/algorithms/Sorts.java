package theme.sorting.algorithms;

import java.util.Arrays;

public class Sorts {
	final static int EVEN = 0, ODD = 1;

	static int[] arr;
	static int SIZE;
	int MAX_INDEX;

	//
	public Sorts() {
		this(16);
	}

	public Sorts(int size) {
		SIZE = size;
		MAX_INDEX = SIZE - 1;
		initArray();
	}

	//
	public void initArray() {
		arr = initArray(arr);
	}

	public int[] initArray(int[] arr) {
		arr = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			arr[i] = (int) (Math.random() * SIZE * SIZE) + 1;
		}
		return arr;
	}

	public boolean swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;

		return true;
	}

	public void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	protected int[] merge2Arrays(int[] arr1st, int[] arr2nd) {
		int newSize = arr1st.length + arr2nd.length;
		int[] newArr = new int[newSize];

		int idx1st = 0, idx2nd = 0;
		int idxNew = 0;

		// 1) compare values, fill those in new
		while (idx1st < arr1st.length && idx2nd < arr2nd.length) {
			if (arr1st[idx1st] <= arr2nd[idx2nd]) {
				newArr[idxNew] = arr1st[idx1st++];
			} else if (arr2nd[idx2nd] <= arr1st[idx1st]) {
				newArr[idxNew] = arr2nd[idx2nd++];
			}
			idxNew++;
		}

		// 2) after finishing an array, fill the rest
		for (int i = idxNew; i < newArr.length; i++) {
			if (idx1st >= arr1st.length) {
				newArr[i] = arr2nd[idx2nd++];
			} else if (idx2nd >= arr2nd.length) {
				newArr[i] = arr1st[idx1st++];
			}
		}

		printArray(newArr);
		return newArr;
	}
}
