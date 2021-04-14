package NumberConversion;

import java.util.Scanner;

public class AnyBaseToAnyBase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();

		int res = getVal(n, b1, b2);
		System.out.println(res);
	}

	static int getVal(int n, int b1, int b2) {
		int deci = anyBaseToDecimal(n, b1);
		int bc = decimalToAnyBase(deci, b2);
		return bc;
	}

	static int anyBaseToDecimal(int n, int d) {
		int temp = 0;
		int pow = 1;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;

			temp += pow * digit;
			pow = pow * d;
		}
		return temp;
	}

	static int decimalToAnyBase(int n, int d) {
		int temp = 0;
		int pow = 1;
		while (n > 0) {
			int digit = n % d;
			n = n / d;
			temp += pow * digit;

			pow = pow * 10;
		
		}
		return temp;
	}
}
