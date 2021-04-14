package Sorting;

public class SelectionSort {
	public static void main(String[] args) {

		int a[] = { 5, 2, 1, 56, 69, 45, 1, 3, 0, 21,-1,-2 };

		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[minIndex])
					minIndex = j;
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		for (int sortedElement : a)
			System.out.print(sortedElement + ",");
	}

}
