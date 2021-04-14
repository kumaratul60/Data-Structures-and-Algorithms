package BitMagic;

import java.util.Scanner;

public class Add2Num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				System.out.println(main(x,y));
				
			}
			
		
	}

	static int main(int a, int b) {
		while (b != 0) {
			int carry = a & b;
			a ^= b;
			b = carry << 1;

		}
		return a;
	}
	

}
