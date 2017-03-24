package theme.sorting;

public class BubbleSort extends Sort {
	public BubbleSort() {
		super(10);
	}
	public BubbleSort(int size) {
		super(size);
	}
	
	public void sort(int[] arr) {
		sort(arr, Direction.ASC);
	}

	public void sort(int[] arr, Direction dir) {
		switch (dir) {
		case ASC:
			sortAsc(arr);
			printArray();
			break;
		case DESC:
			sortDesc(arr);
			printArray();
			break;
		}
	}

	// private
	private void sortAsc(int[] arr) {
		while (true) {
			boolean isChanged = false;

			for (int i = 0; i < MAX_INDEX; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(i, i + 1);
					isChanged = true;
				}
				printArray();
			}

			if (isChanged == false) {
				break;
			}
		}
	}

	private void sortDesc(int[] arr) {
		while (true) {
			boolean isChanged = false;

			for (int i = MAX_INDEX; i > 0; i--) {
				if (arr[i - 1] < arr[i]) {
					swap(i - 1, i);
					isChanged = true;
				}
				printArray();
			}

			if (isChanged == false) {
				break;
			}
		}
	}
}
