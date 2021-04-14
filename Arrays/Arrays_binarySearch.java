package Arrays;

import java.util.Arrays;

public class Arrays_binarySearch {

	public static void main(String[] args) {

		// 2.static int binarySearch(elementToBeSearched): These methods searches for
		// the specified element in the array with the help of Binary Search algorithm.

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		Arrays.sort(intArr);

		int intKey = 22;

		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));
	}

}
