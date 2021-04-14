package Arrays_Classes;

import java.util.Arrays;

public class copyOf {

	public static void main(String[] args) {
		// copyOf(originalArray, newLength): This method copies the specified array,
		// truncating or padding with the default value (if necessary) so the copy has
		// the specified length.
		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// To print the elements in one line
		System.out.println("Integer Array: " + Arrays.toString(intArr));

		System.out.println("\nNew Arrays by copyOf:\n");

		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOf(intArr, 10)));

	}

}
