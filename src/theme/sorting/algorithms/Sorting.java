package theme.sorting.algorithms;

import java.util.Arrays;

public class Sorting {
	static int[] arr;
	int SIZE;
	int MAX_ARRAY;

	public Sorting() {
		this(16);
	}

	public Sorting(int size) {
		SIZE = size;
		MAX_ARRAY=SIZE-1;
		initialize();
	}

	public int[] initialize() {
		int[] arr = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			arr[i] = (int) (Math.random() * SIZE * SIZE) + 1;
		}
		return arr;
	}

	public void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
