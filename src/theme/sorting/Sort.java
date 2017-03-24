package theme.sorting;

public class Sort {
	int SIZE;
	int MAX_INDEX = SIZE = 1;

	static int[] array;

	public Sort() {
		this(10);
	}

	public Sort(int size) {
		SIZE = size;
		initArray();
	}

	public void initArray() {
		array = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			array[i] = (int) (Math.random() * SIZE * SIZE) + 1;
		}
	}

	public void swap(int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public void printArray() {
		System.out.println(array);
	}
}
