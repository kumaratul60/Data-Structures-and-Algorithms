package Arrays;

import java.util.Scanner;

public class Majority_MooreVoting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

//		Majority_MooreVoting mv = new Majority_MooreVoting();
//		System.out.println(mv.findMajority(arr, n));
		int mElement = findMajority(arr, n);
		System.out.println(mElement);
	}

	static int findMajority(int arr[], int n) {

		// find the element

		int res = 0, count = 1;
		for (int i = 1; i < n; i++) {
			if (arr[res] == arr[i])
				count++;
			else
				count--;
			if (count == 0) {

				res = i;
				count = 1;
				// count++;
			}
		}

		// check if the candidate is actually a majority

		count = 0;
		int num = arr[res];
		for (int i = 0; i < n; i++) {
			if (num == arr[i])
				count++;
		}
		if (count > (int) Math.floor(n / 2))
			return num;
		else
			return -1;

	}

}
