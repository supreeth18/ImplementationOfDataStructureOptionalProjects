package datastruct.MergePQCompare.edu;

/**
 * Merge sort algorithm
 * 
 * @author Nagasupreeth Ramesh
 *
 */
public class MergeSortGenerics {
	int size = 5;
	int[] array = new int[size];

	public void initializeArray() {
		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random() * 100);
		}

		mergesort(array);
	}

	public void mergesort(int[] array) {
		int[] newArray = new int[array.length];
		mergesortalgorithm(array, newArray, 0, array.length - 1);
	}

	public void mergesortalgorithm(int[] array, int[] helperArray, int low,
			int high) {
		if (low < high) {
			int middle = low + (high - low) / 2;
			mergesortalgorithm(array, helperArray, low, middle);
			mergesortalgorithm(array, helperArray, middle + 1, high);
			merge(array, helperArray, low, middle, high);
		}
	}

	// Here is the Method that will do the actual Merging
	public void merge(int[] array, int[] newArray, int low, int middle, int high) {
		for (int i = low; i <= high; i++) {
			newArray[i] = array[i];
		}

		int newArrayLeftPart = low;
		int newArrayRightPart = middle + 1;
		int elementBeingProcessed = low;

		// Here we will compare the left and the right sub arrays and the
		// smaller element gets copied into
		// original Array itself
		while (newArrayLeftPart <= middle && newArrayRightPart <= high) {
			if (newArray[newArrayLeftPart] < newArray[newArrayRightPart]) {
				array[elementBeingProcessed] = newArray[newArrayLeftPart];
				newArrayLeftPart++;
			} else {
				array[elementBeingProcessed] = newArray[newArrayRightPart];
				newArrayRightPart++;
			}
			elementBeingProcessed++;
		}

		int remainingElemetsinArray = middle - newArrayLeftPart;
		for (int i = 0; i <= remainingElemetsinArray; i++) {
			array[elementBeingProcessed + i] = newArray[newArrayLeftPart + i];
		}
	}

	public void printElements() {

		for (int resArray : array) {
			System.out.println(resArray);
		}
	}

	// Here the space complexity is 0(n) since we are using one more array i,e
	// auxillary space that is being used
	// to do the merging process.
	public static void main(String[] args) {
		MergeSortGenerics mergesort = new MergeSortGenerics();

		Timer timer = new Timer();
		timer.start();

		mergesort.initializeArray();

		mergesort.printElements();

		timer.end();
		System.out.println(timer);
	}

}
