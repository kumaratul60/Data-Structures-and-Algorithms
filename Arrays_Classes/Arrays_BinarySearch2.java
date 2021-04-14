package Arrays_Classes;

import java.util.Arrays;

public class Arrays_BinarySearch2 {

	public static void main(String[] args) {
		// static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key,
		// Comparator<T> c): This method searches a range of the specified array for the
		// specified object using the binary search algorithm.
		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		Arrays.sort(intArr);

		int intKey = 22;

		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey));

	}

}
