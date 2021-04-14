package Arrays_Classes;

import java.util.Arrays;

public class Equals {

	public static void main(String[] args) {
		// equals(array1, array2): This method checks if both the arrays are equal or
		// not.
		int intArr[] = { 10, 20, 15, 22, 35 };

		// Get the second Arrays
		int intArr1[] = { 10, 15, 22 };

		// To compare both arrays
		System.out.println("Integer Arrays on comparison: " + Arrays.equals(intArr, intArr1));

	}

}
