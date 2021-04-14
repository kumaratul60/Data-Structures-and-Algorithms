package Fast_Input_Op;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

//https://codeforces.com/blog/entry/7018

public class fastIo {

	public static void main(String[] args) {

		// Use the Scanner class
		Scanner sc1 = new Scanner(System.in);
		/*
		 * int n = sc1.nextInt(); 			// read input as integer 
		 * long k = sc1.nextLong();			// read input as long
		 * double d = sc1.nextDouble(); 	// read input as double
		 * String str = sc1.next(); 		// read input as String
		 * String s = sc1.nextLine();		 // read whole line as String
		 * 
		 */

//////////////////////////////////////////////////////////////////////////////////////////

		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));

		// Start writing your solution here. -------------------------------------

		/*
		 * int n = sc.nextInt(); // read input as integer long k = sc.nextLong(); //
		 * read input as long double d = sc.nextDouble(); // read input as double String
		 * str = sc.next(); // read input as String String s = sc.nextLine(); // read
		 * whole line as String
		 * 
		 * int result = 3*n; out.println(result); // print via PrintWriter
		 */

		// Stop writing your solution here. -------------------------------------
		out.close();
	}

	// -----------PrintWriter for faster output---------------------------------
	public static PrintWriter out;

	// -----------MyScanner class for faster input----------
	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	// --------------------------------------------------------

}
