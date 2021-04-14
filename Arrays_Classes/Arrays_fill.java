package Arrays_Classes;

import java.util.Arrays;

public class Arrays_fill {

	public static void main(String[] args) {
		// fill(originalArray, fillValue): This method assigns this fillValue to each
		// index of this Arrays

		int intArr[] = { 10, 20, 15, 22, 35 };

		int intKey = 22;

		Arrays.fill(intArr, intKey);

		// To fill the arrays
		System.out.println("Integer Array on filling: " + Arrays.toString(intArr));

	}

}
