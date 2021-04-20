/*
Catlan numbers are the sequence of natural numbers, which occurs in the form of various counting number problems. cn=1n+1(2nn)=2n! (n+1)! n!

The Catalan numbers are a sequence of positive integers that appear in many counting problems in combinatorics. 
They count certain types of lattice paths, permutations, binary trees, and many other combinatorial objects.


Example

->Taking and input n.
->Check If n <= 1 then, Return 1.
->Loop from i=0 to i<n and i++
->For every i Set result = result + (catalan(i)*catalan(n-i-1))
->Return and print the result.


 Catalan numbers are a sequence of positive integers, where the nth term in the sequence, denoted Cn, is found in the following formula:

Cn = (2n)! / ((n + 1)!n!)
Here n!, pronounced n factorial, is equal to the product of all of the integers from n down to 1.

(n) ⋅ (n - 1) ⋅ (n - 2) ⋅ … ⋅ 2 ⋅ 1


Application: Pentagon Problem

Catalan numbers are directly related to how many ways we can split an n-gon into triangles by connecting vertices where no two line segments cross.
The number of possibilities is equal to Cn - 2.

*/
package MagicNumber;

public class CatalnNumber {

	public static void main(String[] args) {

			for (int i = 0; i < 10; i++) {
				System.out.print(catalan(i) + " ");
			}
		}
	
	static int catalan(int n) {
		int res = 0;

		// Base case
		if (n <= 1) {
			return 1;
		}
		for (int i = 0; i < n; i++) {
			res += catalan(i) * catalan(n - i - 1);
		}
		return res;
	}

}
