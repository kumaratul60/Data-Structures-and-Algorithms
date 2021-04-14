package NumberConversion;

import java.util.Scanner;

public class DecimalToAnyBase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int res = valueInBase(n, d);
			System.out.println(res);

		}

	}

	static int valueInBase(int n, int d) {
		int temp = 0;
		int pow = 1;
		while (n > 0) {
			int dig = n % d;
			n = n / d;
			temp += dig * pow;
			pow = pow * 10;

		}
		return temp;
	}

}
