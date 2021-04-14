package Recursiion;

import java.util.Scanner;

public class fun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		fun f = new fun();
		System.out.println(f.fon(n,m));

	}

//	int fon(int k) {
//		if (k == 4)
//			return k;
//		else
//			return 2 * fon(k + 1);
//	}
	int fon(int x, int y)
	{
	 if (x == 0)
	 return y;
	 return fon(x - 1,  x + y);
	}


}
