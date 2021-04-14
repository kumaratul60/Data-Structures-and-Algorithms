package Recursion_ADV;

public class Lexico {

	public static void main(String[] args) {

		lexico(13, 0);
		
		System.out.println("total numner = " + count);

	}

	static int count = 0;
	
	// i = current number
	// n = limit number
	static void lexico(int n, int i) {
		if (n < i)
			return;
		count += 1;    
		System.out.println(i);
		
		for (int j = (i == 0) ? 1 : 0; j <= 9; j++)
		
			lexico(n, 10 * i + j);
	}
	

}
