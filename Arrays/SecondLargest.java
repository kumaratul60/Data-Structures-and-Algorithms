package Arrays;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

//		int largest = a[0];
//		int secondLargest = a[0];
		int largest, secondLargest;
		largest = secondLargest = -1;
		int index = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
				index = i;
			} else if (a[i] > secondLargest) {
				secondLargest = a[i];
				index = i;
			}

		}

		System.out.println(secondLargest);
		System.out.println(index);
	}

}
