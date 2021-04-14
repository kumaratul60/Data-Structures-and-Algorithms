package Arrays_Classes;

import java.util.Arrays;

public class Arrays_Sort {

	public static void main(String[] args) {

		/*
		 * // sort(originalArray): This method sorts the complete array in ascending
		 * order. int intArr[] = { 10, 20, 15, 22, 35 };
		 * 
		 * // To sort the array using normal sort- Arrays.sort(intArr);
		 * 
		 * System.out.println("Integer Array: " + Arrays.toString(intArr));
		 */

		// sort(originalArray, fromIndex, endIndex): This method sorts the specified
		// range of array in ascending order

		int intArr[] = { 10, 20, 15, 22, 35 };

		// To sort the array using normal sort
		Arrays.sort(intArr, 1, 3);

		System.out.println("Integer Array: " + Arrays.toString(intArr));

	}

}
