package Matrix;

import java.util.Scanner;

public class Char_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char a[] = new char[n + 1];
		for (int i = 0; i < n; i++)
			a[i] = sc.next().charAt(0);
		// a[i] = (char)sc.nextInt();
//		int i = 0;
//		while (a[i] != '\0') {
//			System.out.println(a[i]);
//			i++;
//		}
		boolean check = true;
		for (int i = 0; i < n; i++) {
			if (a[i] != a[n - 1 - i]) {
				check = false;
				break;
			}
		}
		if (check == true)
			System.out.println("palindrom");
		else
			System.out.println("!palindrom");

	}

}
