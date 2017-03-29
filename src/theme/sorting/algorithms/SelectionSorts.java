package theme.sorting.algorithms;

public class SelectionSorts extends Sorts {
	public static void main(String[] args) {
		SelectionSorts ss = new SelectionSorts();
		int[] arr = ss.initArray()	;
		ss.selectionSort(arr);
	}
	
	public SelectionSorts() {
		super();
	}
	
	// 1.
	public void selectionSort(int[] arr) {
		printArray(arr);
		
		for(int i=0; i<arr.length; i++) {
			int lower = i;
			
			for( int j=i; j<arr.length; j++) {
				if(arr[j] < arr[lower]) {
					lower = j;
				}
			}
			swap(arr, i, lower);
			printArray(arr);
		}
	}

	// 2.
	public void heapSort(int[] arr) {

	}

	// 3.
	public void smoothSort(int[] arr) {

	}

	// 4.
	public void cartesianTreeSort(int[] arr) {

	}

	// 5.
	public void tournamentSort(int[] arr) {

	}

	// 6.
	public void cycleSort(int[] arr) {

	}

	// 7.
	public void weakHeapSort(int[] arr) {

	}
}
