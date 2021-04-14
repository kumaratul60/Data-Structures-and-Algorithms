package Arrays;

public class LeftRotation_All {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5 }, n = 5, d = 2;

		System.out.println("Before Rotation");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		leftRotate(arr, d, n);

		System.out.println("After Rotation");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	
	// lRotateOne & RotateOne method same but implementation thoda dekh le
	
	static void lRotateOne(int arr[], int n) {
		int temp = arr[0];

		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}

		arr[n - 1] = temp;
	}

	static void RotateOne(int a[], int n) {
		int temp = a[0];
		for (int i = 1; i < n; i++) {

			a[i - 1] = a[i];
			a[i] = temp;
		}
	}

	static void leftRotate(int arr[], int d, int n) {
		for (int i = 0; i < d; i++) {
			RotateOne(arr, n);
		}
	}

	/////////////////////////////////////////
	static void leftRotate_D(int arr[], int d, int n) {
		int temp[] = new int[d];

		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		for (int i = d; i < n; i++) {
			arr[i - d] = arr[i];
		}

		for (int i = 0; i < d; i++) {
			arr[n - d + i] = temp[i];
		}
	}

	////////////////////////////////////////////////////////////////////////

	static void leftRotate_ReversalAlgo(int arr[], int d, int n) {
		reverse(arr, 0, d - 1);

		reverse(arr, d, n - 1);

		reverse(arr, 0, n - 1);

	}

	static void reverse(int arr[], int low, int high) {
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;

			low++;
			high--;
		}
	}

}
