package GFG_30_days_code;

public class Day10_Secret_Cipher {
	public static void main(String[] args) {
		String s = "ababcababcd";
		System.out.println(compress(s));

	}

	public static String compress(String s) {

		int i;
		String res = "";
		i = s.length() / 2 - 1;
		while (i >= 0) {
			if (s.substring(0, i + 1).equals(s.substring(i + 1, 2 * i + 2))) {
				res = s.substring(0, i + 1) + "*" + s.substring(2 * i + 2, s.length());
				s = res;
				i = s.length() / 2 - 1;
			} else
				i--;
		}
		return res;

	}

}
