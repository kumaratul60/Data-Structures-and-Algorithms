package Arrays_Classes;

import java.util.Arrays;

public class static_boolean_deepEquals {

	public static void main(String[] args) {
		// static boolean deepEquals(Object[] a1, Object[] a2): This method returns true
		// if the two specified arrays are deeply equal to one another.
		int intArr[][] = { { 10, 20, 15, 22, 35 } };

		// Get the second Arrays
		int intArr1[][] = { { 10, 15, 22 } };

		// To compare both arrays
		System.out.println("Integer Arrays on comparison: " + Arrays.deepEquals(intArr, intArr1));
	}

}
