package Arrays;

import java.util.Scanner;

public class Mahasena {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int lucky = 0, unlucky = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0)
				lucky++;
			else
				unlucky++;
		}
		if (lucky > unlucky)
			System.out.println("Ready for battel");
		else
			System.out.println("Not ready");

	}

}
