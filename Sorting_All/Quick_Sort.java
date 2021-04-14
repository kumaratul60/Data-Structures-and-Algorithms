package Sorting_All;

import java.util.Arrays;

//Worst case Complexity : O(n^2)
//Best case Complexity: O(nlogn)
//Average Case Complexity: O(nlogn)
//Worst case space Complexity: O(1)

public class Quick_Sort {

	public static void main(String[] args) {
		int[] array = { 8, 5, 3, 9, 1, 4, 12 };
		System.out.println("Input array " + Arrays.toString(array));
		quickSort(array, 0, array.length - 1);
		System.out.println("Sorted array " + Arrays.toString(array));

	}

	static void quickSort(int[] input, int low, int high) {

		if (high > low) {
			int pivot = partition(input, low, high);
			quickSort(input, low, pivot - 1);
			quickSort(input, pivot + 1, high);
		}
	}

	private static int partition(int[] array, int low, int high) {
		int left, right, pivot_item = array[low];
		left = low;
		right = high;
		while (left < right) {
			while (array[left] <= pivot_item)
				left++;
			while (array[right] > pivot_item)
				right--;
			if (left < right) {
				swap(array, left, right);
			}
		}
		array[low] = array[right];
		array[right] = pivot_item;
		return right;
	}

	private static void swap(int[] array, int left, int right) {
		int temp;
		temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

}
