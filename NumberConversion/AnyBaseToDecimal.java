package NumberConversion;

import java.util.Scanner;

public class AnyBaseToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int res = bDecimal(n, d);
			System.out.println(res);

		}
	}

	static int bDecimal(int n, int d) {
		int temp = 0;
		int pow = 1;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			temp += digit * pow;
			pow = pow * d;
		}
		return temp;

	}

}
