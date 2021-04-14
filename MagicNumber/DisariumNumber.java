package MagicNumber;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(check(n));
		}
	}

	static int countDigit(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	static boolean check(int n) {
		 int count_digits = countDigit(n);
		//int count_digits = Integer.toString(n).length();
		int sum = 0;
		int temp = n;
		while (temp != 0) {
			int lastDigit = temp % 10;
			sum +=  Math.pow(lastDigit, count_digits--);
			temp /= 10;
		}
		return (sum == n);

	}

}
