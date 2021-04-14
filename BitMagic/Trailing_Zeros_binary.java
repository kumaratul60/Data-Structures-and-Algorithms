package BitMagic;

import java.util.Scanner;

public class Trailing_Zeros_binary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(trailing0(n));
		}
	}

	static int trailing0(int n) {
		if (n % 2 == 1) {
			return 0;
		}
		int cnt = 0;
		while (n % 2 == 0) {
			n /= 2;
			cnt++;
		}
		return cnt;
		
//		  int count = 0;
//	        while((n & 1) == 0 && n>0){
//	            count++;
//	            n/=2;
//	        }
//	        return count;
	}

}
