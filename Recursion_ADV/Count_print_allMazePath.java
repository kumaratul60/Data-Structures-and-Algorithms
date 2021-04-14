package Recursion_ADV;

public class Count_print_allMazePath {

	public static void main(String[] args) {

		mazePath(0, 0, 3, 3, "");
		System.out.println("Total Paths = " + totalpath);

	}

	static int totalpath = 0;

	// move right, down,digonally
	static void mazePath(int i, int j, int n, int m, String ans) {

		if (i == n - 1 && j == m - 1) {
			totalpath += 1;
			System.out.println(ans);
			return;
		}

		if (i >= n || j >= m) {
			return;
		}

		mazePath(i, j + 1, n, m, ans + "R"); // rightword move
		mazePath(i + 1, j, n, m, ans + "D"); // downword move
		mazePath(i + 1, j + 1, n, m, ans + "-->"); // move digonally

	}

}
