package theme.sorting.algorithms;

public class ExchangeSorts extends Sorting {
	public static void main(String[] args) {
		ExchangeSorts es = new ExchangeSorts();
		arr = es.initialize();
		es.combSort(arr);
	}

	public ExchangeSorts() {
		super();
	}

	public ExchangeSorts(int size) {
		super(size);
	}

	// 1
	public void bubblesort(int[] arr) {
		while (true) {
			boolean isChanged = false;

			for (int i = 0; i < MAX_ARRAY; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
					isChanged = true;
				}
				printArray(arr);
			}

			if (isChanged == false) {
				break;
			}
		}
	}

	// 2
	public void cocktailShakerSort(int[] arr) {

	}

	// 3
	public void oddEvenSort() {

	}

	// 4.
	public void combSort(int[] arr) {
		final float shrink = 1.3F;

		for (int gap =MAX_ARRAY; gap > 1; gap--) {
			boolean isSorted =false;
			
			for (int i = 0; gap + i < arr.length; i++) {
				if (arr[i] > arr[i + gap]) {
					swap(arr, i, i + gap);
					isSorted = true;
				}
			}
			
			if(isSorted == false) {
				gap/=shrink;
			}
		}
	}

	// 5
	public void gnomeSort() {

	}

	// 6
	public void quickSort() {

	}

	// 7
	public void slowSort() {

	}

	// 8
	public void stoogeSort() {

	}

	// 9
	public void bogoSort() {

	}
}
