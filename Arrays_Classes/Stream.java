package Arrays_Classes;

import java.util.Arrays;

public class Stream {

	public static void main(String[] args) {
		// stream(originalArray): This method returns a sequential stream with the
		// specified array as its source.

		int intArr[] = { 10, 20, 15, 22, 35 };

		// To get the Stream from the array
		System.out.println("Integer Array: " + Arrays.stream(intArr));

	}

}
