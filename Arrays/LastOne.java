package Arrays;

import java.util.Scanner;

public class LastOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int firstIndex = -1;
			int lastIndex = -1;

			for (int i = 0; i < n; i++) {

				if (a[i] == 1 && firstIndex == -1)    // if want to search an other number then 1 = search(that num)
					firstIndex = i;

				if (a[i] == 1 && firstIndex != -1)
					lastIndex = i;
				

			}
			System.out.println(firstIndex);
			System.out.println(lastIndex);

		}

	}

}
