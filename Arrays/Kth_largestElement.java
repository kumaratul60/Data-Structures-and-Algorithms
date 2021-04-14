package Arrays;

public class Kth_largestElement {
	public static void main(String[] args) {
		int a[] = { 6, 8, 39, 7, 2, 35, 2, 6, 4, 0, 8, 9,256 };
		int k = 2;
		for (int i : a)
			System.out.print(i + ",");
		System.out.println("Kth largest elemnet :");
		System.out.println(kth(a, k));

	}

	static int kth(int a[], int k) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

			if (i == k - 1) {
				// System.out.println("Kth largest element is "+a[i]);
				return a[i];
				// break;

			}

		}
		return -1;

	}

}
