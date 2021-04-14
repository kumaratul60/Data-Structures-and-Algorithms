package Arrays_Classes;

import java.util.Arrays;

public class ToString {

	public static void main(String[] args) {

		/*
		 * Description: Returns a string representation of the contents of the specified
		 * array. The string representation consists of a list of the array’s elements,
		 * enclosed in square brackets (“[]”). Adjacent elements are separated by the
		 * characters “, ” (a comma followed by a space). Returns “null” if a is null.
		 * 
		 * In case of an Object Array, if the array contains other arrays as elements,
		 * they are converted to strings by the Object.toString() method inherited from
		 * Object, which describes their identities rather than their contents.
		 * 
		 * Variants:
		 * 
		 * 
		 * 
		 * public static String toString(boolean[] arr) public static String
		 * toString(byte[] arr) public static String toString(char[] arr) public static
		 * String toString(double[] arr) public static String toString(float[] arr)
		 * public static String toString(int[] arr) public static String toString(long[]
		 * arr) public static String toString(Object[] arr) public static String
		 * toString(short[] arr) Parameters: arr – the array whose string representation
		 * to return
		 * 
		 * Returns: the string representation of arr
		 * 
		 */

		// toString(originalArray): This method returns a String representation of the
		// contents of this Arrays. The string representation consists of a list of the
		// array’s elements, enclosed in square brackets (“[]”). Adjacent elements are
		// separated by the characters a comma followed by a space. Elements are
		// converted to strings as by String.valueOf() function

		int intArr[] = { 10, 20, 15, 22, 35 };

		// To print the elements in one line
		System.out.println("Integer Array: " + Arrays.toString(intArr));
	}

}
