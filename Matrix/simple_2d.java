package Matrix;

public class simple_2d {

	public static void main(String[] args) {

		// int arr[][] = { { 1, 2, 3, 8, 9 }, { 4, 5, 6 } };

//		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//		}
		int a[] = { 0 };
		simple2(a);
	}

	static void simple(int arr1[]) {
		int m = 2, n = 3;

		int arr[][] = new int[m][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}

	static void simple1(int arr1[]) {
		int m = 2, n = 3;

		int arr[][] = new int[m][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10;

				System.out.print(arr[i][j] + " ");
			}
		}
	}

	static void simple2(int arr1[]) {
		int m = 2, n = 3;

		int arr[][] = new int[m][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10;

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}



}
