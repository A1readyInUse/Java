package theme.sorting.algorithms;

import java.util.Arrays;

public class Sorts {
	final static int EVEN = 0, ODD = 1;

	int SIZE;
	int MAX_INDEX;

	public Sorts() {
		this(16);
	}

	public Sorts(int size) {
		SIZE = size;
		MAX_INDEX = SIZE - 1;
	}

	public int[] initArray() {
		int[] arr = new int[SIZE];
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
}
