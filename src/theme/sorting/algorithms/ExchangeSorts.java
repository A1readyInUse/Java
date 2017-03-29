package theme.sorting.algorithms;

public class ExchangeSorts extends Sorts {
	public static void main(String[] args) {
		ExchangeSorts es = new ExchangeSorts();
		int[] arr = es.initArray();
		es.cocktailShakerSort(arr);
	}

	public ExchangeSorts() {
		super();
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
						printArray(arr);
					}
				}
				right--;
				break;

			case ODD:
				// left << right, set minimum
				for (int j = right; j > left; j--) {
					if (arr[j] < arr[j - 1]) {
						isSwapped = swap(arr, j, j - 1);
						printArray(arr);
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
	public void quickSort() {

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
