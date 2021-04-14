package Arrays_Classes;

import java.util.Arrays;

public class spliterator {

	public static void main(String[] args) {
		// spliterator(originalArray, fromIndex, endIndex): This method returns a
		// Spliterator of the type of the array covering the specified range of the
		// specified Arrays

		int intArr[] = { 10, 20, 15, 22, 35 };

		// To sort the array using normal sort
		System.out.println("Integer Array: " + Arrays.spliterator(intArr, 1, 3));
	}

}
