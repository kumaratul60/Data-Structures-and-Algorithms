package Arrays_Classes;

import java.util.Arrays;

public class static_String_deepToString {

	public static void main(String[] args) {
		// static String deepToString(Object[] a): This method returns a string
		// representation of the “deep contents” of the specified Arrays.
		int intArr[][] = { { 10, 20, 15, 22, 35 } };

		// To get the deep String of the arrays
		System.out.println("Integer Array: " + Arrays.deepToString(intArr));
	}

}
