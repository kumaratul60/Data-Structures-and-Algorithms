package Recursiion;

import java.util.Scanner;

public class fun1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fun1 f = new fun1();
		f.fun(n);
	}

	void fun(int n) {
		if (n == 0)
			return;
		System.out.print(n % 2);
		fun(n / 2);

	}

}
