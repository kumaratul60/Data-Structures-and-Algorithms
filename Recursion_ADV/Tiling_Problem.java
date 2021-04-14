package Recursion_ADV;

import java.util.Scanner;

public class Tiling_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(tilingWays(n));
		}
	}

	static int tilingWays(int n) {
		if(n==0)return 0;
		if(n==1)return 1;
		
		return tilingWays(n-1)+tilingWays(n-2);
		
	//	tilingWays(n-1) =  Verticle placed
	// tilingWays(n-1) =  Horizontal placed
	}

}
