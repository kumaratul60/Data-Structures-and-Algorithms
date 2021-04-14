package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		// int google = LargButMinFreq(a, n);
		System.out.println(new FrequencyGame().LargButMinFreq(a, n));

	}

	public static int LargButMinFreq(int arr[], int n) {
		// Your code here
		Arrays.sort(arr);
		int ans = 0;
		for (int i = n - 1; i > 0; i *= 2) {
			if (arr[i] != arr[i - 1]) {
				ans = arr[i];
				break;
			}

		}
		return ans;
	}

}
