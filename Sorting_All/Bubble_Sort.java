package Sorting_All;

import java.util.Arrays;

//Worst case Complexity : O(n^2)
//Best case Complexity: O(n)
//Average Case Complexity: O(n^2)
//Worst case space Complexity: O(1)

public class Bubble_Sort {

	public static void main(String[] args) {

	}

	public void bubbleSort(int[] input) {
		System.out.println("Input array " + Arrays.toString(input));
		for (int i = input.length - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		System.out.println("Output Array: " + Arrays.toString(input));
	}

}
