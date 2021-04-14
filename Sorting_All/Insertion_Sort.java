package Sorting_All;

import java.util.Arrays;

//Worst case Complexity : O(n^2)
//Best case Complexity: O(n^2)
//Average Case Complexity: O(n^2)
//Worst case space Complexity: O(n^2)

public class Insertion_Sort {

	public static void main(String[] args) {

	}

	public void insertionSort(int[] inputArray) {
		System.out.println("Input array " + Arrays.toString(inputArray));
		for (int i = 0; i < inputArray.length; i++) {
			int temp = inputArray[i];
			int j = i;
			while (j > 0 && inputArray[j - 1] > temp) {
				inputArray[j] = inputArray[j - 1];
				j = j - 1;
			}
			inputArray[j] = temp;
		}
		System.out.println("Sorted array " + Arrays.toString(inputArray));
	}

}
