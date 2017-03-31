package theme.sorting.algorithms;

public class ExchangeSorts extends Sorts {
	public static void main(String[] args) {
		ExchangeSorts qs = new ExchangeSorts(11);
		qs.quickSort(arr, 0, arr.length);
	}

	//
	public ExchangeSorts() {
		super();
	}

	public ExchangeSorts(int size) {
		super(size);
	}

	// 1.
	public void bubblesort(int[] arr) {
		boolean isSwapped = false;

		do {
			for (int i = 0; i < MAX_INDEX; i++) {
				if (arr[i] > arr[i + 1]) {
					isSwapped = swap(arr, i, i + 1);
					printArray(arr);
				}
			}
		} while (isSwapped);
	}

	// 2.
	public void cocktailShakerSort(int[] arr) {
		int left = 0;
		int right = MAX_INDEX;
		int direction = 0;
		boolean isSwapped;

		do {
			isSwapped = false;

			switch (direction % 2) {
			case EVEN:
				// left >> right, set maximum
				for (int i = left; i < right; i++) {
					if (arr[i] > arr[i + 1]) {
						isSwapped = swap(arr, i, i + 1);
					}
				}
				right--;
				break;

			case ODD:
				// left << right, set minimum
				for (int j = right; j > left; j--) {
					if (arr[j] < arr[j - 1]) {
						isSwapped = swap(arr, j, j - 1);
					}
				}
				left++;
				break;
			}

			direction++;
		} while (isSwapped);
	}

	// 3.
	public void oddEvenSort() {

	}

	// 4.
	public void combSort(int[] arr) {
		final float shrink = 1.3F;

		for (int gap = MAX_INDEX; gap > 1; gap--) {
			boolean isSwapped = false;

			for (int base = 0; base + gap < arr.length; base++) {
				if (arr[base] > arr[base + gap]) {
					isSwapped = swap(arr, base, base + gap);
					printArray(arr);
				}
			}

			if (isSwapped == false) {
				gap /= shrink;
			}
		}
	}

	// 5.
	public void gnomeSort() {

	}

	// 6.
	public int[] quickSort(int arr[], int start, int len) {
		len += start;
		int pivot = start;
		int greater = start + 1;

		// 6.1. find smaller than arr[pivot]
		for (int i = greater; i < len; i++) {
			if (arr[i] < arr[pivot]) {
				if (i == greater) { // when it doesn't swap
					greater++;
					continue;
				}
				swap(arr, i, greater);
				greater++;
				printArray(arr);
			}
		}

		// 6.2. swap pivot
		pivot = greater - 1;

		swap(arr, pivot, start);

		// 6.3.1. less than pivot
		if (pivot != start) {
			arr = quickSort(arr, start, pivot - start);
			printArray(arr);
		}
		// 6.3.2. greater than pivot
		if (len != greater) {
			arr = quickSort(arr, greater, len - greater);
			printArray(arr);
		}

		return arr;
	}

	// 7.
	public void slowSort() {

	}

	// 8.
	public void stoogeSort() {

	}

	// 9.
	public void bogoSort() {

	}
}
