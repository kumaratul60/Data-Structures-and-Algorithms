package Mathmetics;

import java.util.Scanner;

public class ModularMultiplicativeInverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int o = sc.nextInt();
		int n = sc.nextInt();

		System.out.println(new Madulur().modInverse(o, n));
	}
}

class Madulur {
	public int modInverse(int a, int m) {
		int num = 0;
		for (int i = 1; i <= m; i++) {
			if ((a * i) % m == 0) {
				num = i;
				break;
			} else {
				num = -1;
				continue;
			}
		}
		return num;
	}

}
