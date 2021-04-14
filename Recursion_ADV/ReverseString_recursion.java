package Recursion_ADV;

import java.util.Scanner;

public class ReverseString_recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			String ip = sc.next();

			reverse(ip);

		}
	}

	static void reverse(String str) {
		if (str.length() == 0)
			return;

		String ros = str.substring(1);

		reverse(ros);
		System.out.print(str.charAt(0));
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	static int reverseNum(int n) {
		int temp = 0;
		if (n == 0)
			return temp;
		temp = temp * 10 + n % 10;
		return reverseNum(n / 10);

	}

}
