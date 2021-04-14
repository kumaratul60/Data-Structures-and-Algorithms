package Arrays_Classes;

import java.util.Arrays;

public class parallelSort {

	public static void main(String[] args) {
		// parallelSort(originalArray): This method sorts the specified array using
		// parallel sort.
		int intArr[] = { 10, 20, 15, 22, 35 };

		// To sort the array using parallelSort
		Arrays.parallelSort(intArr);

		System.out.println("Integer Array: " + Arrays.toString(intArr));

	}

}
