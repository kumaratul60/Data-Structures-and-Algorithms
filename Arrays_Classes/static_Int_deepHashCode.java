package Arrays_Classes;

import java.util.Arrays;

public class static_Int_deepHashCode {

	public static void main(String[] args) {
		// static int deepHashCode(Object[] a): This method returns a hash code based on
		// the “deep contents” of the specified Arrays.
		int intArr[][] = { { 10, 20, 15, 22, 35 } };

		// To get the dep hashCode of the arrays
		System.out.println("Integer Array: " + Arrays.deepHashCode(intArr));

	}

}
