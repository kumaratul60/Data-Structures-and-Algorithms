package Arrays_Classes;

import java.util.Arrays;

public class CompareUnsigned {

	public static void main(String[] args) {
		// compareUnsigned(array 1, array 2): This method compares two arrays
		// lexicographically, numerically treating elements as unsigned.
		// Get the Arrays
		int intArr[] = { 10, 20, 15, 22, 35 };

		// Get the second Arrays
		int intArr1[] = { 10, 15, 22 };

		// To compare both arrays
		System.out.println("Integer Arrays on comparison: " + Arrays.compareUnsigned(intArr, intArr1));

	}

}
