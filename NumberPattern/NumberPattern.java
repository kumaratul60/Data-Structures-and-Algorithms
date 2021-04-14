package NumberPattern;

import java.util.Scanner;

public class NumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println();
		System.out.println("A");
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j);

			System.out.println();
		}
		System.out.println();
		System.out.println("B");
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(i);
			System.out.println();
		}
		System.out.println();
		System.out.println("C");
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		System.out.println("D");
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i + j == n + 1)
					System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("E");
		System.out.println();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				count += 1;
				System.out.print(count);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("F");
		System.out.println();
		int count1 = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				// count += 1;
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("G");
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j);
			for (int k = i - 1; k >= 1; k--)
				System.out.print(k);

			System.out.println();
		}
		System.out.println();
		System.out.println("H");
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print(k);
			for (int l = i; l >= 1; l--)
				System.out.print(l);

			System.out.println();
		}
		System.out.println();
		System.out.println("I");
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--)
				System.out.print(j);
			System.out.println();
		}
		System.out.println();
		System.out.println("J");
		System.out.println();
		for (int i = 1; i <= n; i++) {
			int num = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num = num + n - j;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("K");
		System.out.println();
		int count2 = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				count2 += 1;
				System.out.print(count2 + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("L");
		System.out.println();
		int count3 = 0;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= 3; j++) {
					count3 += 1;
					System.out.print(count3 + " ");
				}
			} else {
				int temp = count3 + 1;
				for (int j = count3 + 3; j >= temp; j--) {
					// for(int j=1;j<=3;j++) {
					count += 1;
					// System.out.print(count+" ");
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("M");
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= 4 - i && j <= 2 + i)
					System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("N");
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i - j == n)
					System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}
	}

}
