package NumberConversion;

import java.math.BigInteger;
import java.util.Scanner;

public class BinaryConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(binary(n));
		}
	}

	static int binary(int n) {
		if (n == 1)
			return 1;
		return binary(n / 2) * 10 + n % 2;
	}

	public static BigInteger binaryConv(BigInteger n) {
		if (n.compareTo(BigInteger.valueOf(1)) == 0) {

			return BigInteger.valueOf(1);
		}
		return ((binaryConv(n.divide(BigInteger.valueOf(2))).multiply(BigInteger.valueOf(10)))
				.add(n.mod(BigInteger.valueOf(2))));
	}

}
