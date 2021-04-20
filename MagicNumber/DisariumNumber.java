/*

A number is called disarium if sum of its digits powered with their respective positions is equal to the number itself.

135 -> 1^1 + 3^2 + 5^3 = 1+9+125 = 135 is.

801 -> 8^1 + 0^2 +1^3 = 8+0+1 + 9 is not.
*/


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
