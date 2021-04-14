package BitMagic;

public class CountSet_bit_nAmazon {

	public static void main(String[] args) {
		
//		 DECIMAL    BINARY  SET BIT COUNT
//		    1          01        1
//		    2          10        1
//		    3          11        2
//		 1 + 1 + 2 = 4 
//		 Answer = 4 % 1000000007 = 4
		
//		A = 1
//				  DECIMAL    BINARY  SET BIT COUNT
//				    1          01        1
//				 Answer = 1 % 1000000007 = 1
		
		System.out.println(solve(3));

	}

	static int solve(int a) {
		a++; // as we would require 0 to a to get the results instead of 1 to a
		int count = 0;
		
		 //for each bit calculating the total number of set bits for numbers until a;
	    // that is number of sets of 2^(i+1) ,each set consisting 2^(i) set bits and
	    //then adding the remainder of bits by getting the modulus with 2^(i+1)
	    //and subtracting the first 2^(i) 0's from the remainder if this result is 
	    //negative just take zero
		
		for (int i = 0; i < 32; i++) 
		{
			int sets = (int) Math.pow(2, i + 1);
			count += ((int) (a / sets) * (int) (sets / 2));
			int remainder = a % sets;
			if (remainder - (int) (sets / 2) > 0) {
				count += remainder - (int) (sets / 2);
			}
			count = count % 1000000007;
		}
		return count;

	}

}
