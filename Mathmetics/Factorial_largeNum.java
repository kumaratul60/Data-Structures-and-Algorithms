package Mathmetics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial_largeNum {
	static String greatProduct(String no, int mul) {

		int n = no.length();
		long carry = 0;

		char arr[] = no.toCharArray();
		for (int i = n - 1; i >= 0; i--) {
			long prod = (int) (arr[i] - '0') * mul;
			prod += carry;

			carry = prod / 10;
			prod = prod % 10;

			arr[i] = (char) (prod + '0');
		}

		String res = new String(arr);

		if (carry > 0) {
			res = Long.toString(carry) + res;
		}

		return res;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(bf.readLine());

		while (tc > 0) {

			int no = Integer.parseInt(bf.readLine());

			String prod = "1";
			for (int i = no; i >= 2; i--) {
				prod = greatProduct(prod, i);
			}

			System.out.println(prod);

			tc--;
		}
		bf.close();
	}

}
