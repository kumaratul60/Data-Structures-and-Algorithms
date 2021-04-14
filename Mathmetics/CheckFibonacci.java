package Mathmetics;

import java.util.Scanner;

public class CheckFibonacci {

	// A number is Fibonacci if and only if one or both of (5*n2 + 4) or (5*n2 – 4)
	// is a perfect square

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			for (int i = 0; i <= n; i++)
				System.out.println(isFibonacci(i) ? i + " is a Fibonacci Number" : i + " is a not Fibonacci Number");
		}

	}

	static boolean isPerfectSquare(int x) {
		int s = (int) Math.sqrt(x);
		return (s * s == x);
	}

	// Returns true if n is a Fibonacci Number, else false
	static boolean isFibonacci(int n) {
		// n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
		// is a perfect square
		return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
	}
	static int fib(int n) 
    { 
        if (n <= 1) 
            return n; 
        return fib(n - 1) + fib(n - 2); 
    } 
	
	 static void Fibonacci(int N) 
	    { 
	        int num1 = 0, num2 = 1; 
	  
	        int counter = 0; 
	  
	        // Iterate till counter is N 
	        while (counter < N) { 
	  
	            // Print the number 
	            System.out.print(num1 + " "); 
	  
	            // Swap 
	            int num3 = num2 + num1; 
	            num1 = num2; 
	            num2 = num3; 
	            counter = counter + 1; 
	        } 
	    } 
	
	static int fib_Dynamic(int n) 
    { 
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n + 1]; 
        int i; 
  
        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0; 
  
        if (n > 0) { 
            f[1] = 1; 
  
            for (i = 2; i <= n; i++) { 
                /* Add the previous 2 numbers in the series 
             and store it */
                f[i] = f[i - 1] + f[i - 2]; 
            } 
        } 
  
        return f[n]; 
    } 
	static int fib_dSpace(int n) 
    { 
        int a = 0, b = 1, c; 
        if (n == 0) 
            return a; 
        for (int i = 2; i <= n; i++) { 
            c = a + b; 
            a = b; 
            b = c; 
        } 
        return b; 
    } 
	

}
