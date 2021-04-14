package Sorting;

public class QuickSort_Recurtion {

	public static void main(String[] args) {
		int a[] = { 48, 36, 13, 52, 19, 94, 24 };
		int len = a.length;

		QuickSort_Recursive(a, 0, len - 1);
		printArr(a);

	}

	public static int Partition(int[] numbers, int left, int right)

	{

		// int pivot = numbers[left];

		// Get the pivot element from the middle of the list
		int pivot = numbers[left + (right - left) / 2];

		while (true)

		{

			while (numbers[left] < pivot)

				left++;

			while (numbers[right] > pivot)

				right--;

			if (left < right)

			{

				int temp = numbers[right];

				numbers[right] = numbers[left];

				numbers[left] = temp;

			}

			else

			{

				return right;

			}

		}

	}

	public static void QuickSort_Recursive(int[] arr, int left, int right)

	{

		// For Recusrion

		if (left < right)

		{

			int pivot = Partition(arr, left, right);

			if (pivot > 1)

				QuickSort_Recursive(arr, left, pivot - 1);

			if (pivot + 1 < right)

				QuickSort_Recursive(arr, pivot + 1, right);

		}

	}

	///// M2
	static void quickRec(int a[], int low, int high) {
		// Base case or terminating case
		if (low >= high) {
			return;
		}
		// Returns pivotIndex
		int pi = Partition(a, low, high);

		// Recursively call quick sort with left part of the partitioned array
		if (low < pi - 1)
			quickRec(a, low, pi - 1);

		// Recursively call quick sort with right part of the partitioned array
		if (pi < high)
			quickRec(a, pi, high);
	}

	static void printArr(int a[]) {
		for (int i : a)
			System.out.print(i + ",");
	}
//}

//	******************************************************************************
	// for simplicity Read that code how q.S work

//	public class Quicksort_read  {
	    private int[] numbers;
	    private int number;

	    public void sort(int[] values) {
	        // check for empty or null array
	        if (values ==null || values.length==0){
	            return;
	        }
	        this.numbers = values;
	        number = values.length;
	        quicksort(0, number - 1);
	    }
	
	
	private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
