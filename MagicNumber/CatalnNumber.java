package MagicNumber;

public class CatalnNumber {

	public static void main(String[] args) {

			for (int i = 0; i < 10; i++) {
				System.out.print(catalan(i) + " ");
			}
		}
	
	static int catalan(int n) {
		int res = 0;

		// Base case
		if (n <= 1) {
			return 1;
		}
		for (int i = 0; i < n; i++) {
			res += catalan(i) * catalan(n - i - 1);
		}
		return res;
	}

}
