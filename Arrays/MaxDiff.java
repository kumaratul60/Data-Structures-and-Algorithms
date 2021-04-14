package Arrays;

public class MaxDiff {

	static int maxDiff(int arr[], int n) {
		int res = arr[1] - arr[0], minVal = arr[0];

		for (int i = 1; i < n; i++) {

			res = Math.max(res, arr[i] - minVal);

			minVal = Math.min(minVal, arr[i]);
		}

		return res;
	}

	static int maxDiff1(int arr[], int n) {
		int res = arr[1] - arr[0];

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				res = Math.max(res, arr[j] - arr[i]);
			}
		}

		return res;
	}

	public static void main(String args[]) {
		int arr[] = { 2, 3, 10, 6, 4, 8, 1 }, n = 7;

		System.out.println(maxDiff(arr, n));

	}

}
