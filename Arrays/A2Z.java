package Arrays;

public class A2Z {
	public static void main(String[] args) {

		char c;
		for (c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}

		System.out.println();
//		for(int i=0;i<=127;i++)
//			System.out.printf("%c\n",i);

		char c1 = 'a';
		while (c1 <= 'z') {
			System.out.print(c1 + " ");
			c1++;
		}

		System.out.println();
		char c2 = 'A';
		do {
			System.out.print(c2 + " ");
			c2++;
		} while (c2 <= 'Z');

	}

}
