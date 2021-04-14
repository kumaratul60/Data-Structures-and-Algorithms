package Arrays_Classes;

import java.util.Arrays;

public class Arrays_compare {

	public static void main(String[] args) {
		// compare(array 1, array 2): This method compares two arrays passed as
		// parameters lexicographically.
		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// Get the second Array
		int intArr1[] = { 10, 15, 22 };

		// To compare both arrays
		System.out.println("Integer Arrays on comparison: " + Arrays.compare(intArr, intArr1));

	}

}
