package GFG_30_days_code;

public class Day11_Repeated_StringMatch {

	public static void main(String[] args) {

		String A = "abcd", B = "cdabcdab";

		System.out.println(repeatedStringMatch1(A, B));
		System.out.println(issubstring(A, B));

	}

	static int repeatedStringMatch(String A, String B) {

		String str = A;
		int res = B.length() / A.length();
		int count = 1;
		for (int i = 0; i < res + 2; i++) {
			if (A.contains(B))
				return count;
			else {
				A += str;
				count++;
			}
		}
		return -1;
	}

	static boolean issubstring(String str2, String rep1) {
		int M = str2.length();
		int N = rep1.length();

		for (int i = 0; i <= N - M; i++) {
			int j;
			for (j = 0; j < M; j++)
				if (rep1.charAt(i + j) != str2.charAt(j))
					break;
			if (j == M) // pattern matched
				return true;
		}
		return false; // not a substring
	}

	static int repeatedStringMatch1(String A, String B) {
		int ans = 1; // To store minimum number of repetations
		String S = A; // To store repeated string

		// Until size of S is less than B
		while (S.length() < B.length()) {
			S += A;
			ans++;
		}

		// Add one more string of A
		if (issubstring(B, S))
			return ans;
		if (issubstring(B, S + A))
			return ans + 1;
		return -1; // If no such solution exits
	}

}
