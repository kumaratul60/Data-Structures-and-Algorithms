package BitMagic;

import java.util.Scanner;

//  mask = 1 << position

//The left shift operator is usually written as "<<".
//0010 << 1  →  0100
//0010 << 2  →  1000
//
//A single left shift multiplies a binary number by 2:
//	
//	  0010 << 1  →  0100
//
//	  0010 is 2
//	  0100 is 4
//	  
//	  Logical Right Shifts
//	  When shifting right with a logical right shift,
//	  the least-significant bit is lost and a 00 is inserted on the other end.
//	  
//	  1011 >>> 1  →  0101
//	  1011 >>> 3  →  0001
//
//For positive numbers, a single logical right shift -
//divides a number by 2, throwing out any remainders.
//
//0101 >>> 1  →  0010
//
//0101 is 5
//0010 is 2
//
////Arithmetic shift
//1011 >> 1  →  1101
// 1011 is -5
// 1101 is -3
//
////Logical shift
//1111 >>> 1  →  0111
// 1111 is -1
// 0111 is  7


public class Basic_BitManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			System.out.println("And: " + anD(n, m));
			System.out.println("OR: " + oR(n, m));
			System.out.println("xOR: " + xOR(n, m));
			System.out.println("invesrse: " + inverS(n, m));
			System.out.println("inverse ~: " + invrse(n));
			System.out.println("leftShift: " + leftShift(n, m));
			System.out.println("rightShift: " + rightShift(n, m));
			System.out.println("LogicalRightShift1: " + LogicalrightShift1(n, m));

		}

	}

	static int anD(int a, int b) {

		return a & b;
	}

	static int oR(int a, int b) {

		return a | b;
	}

	static int xOR(int a, int b) {

		return a ^ b;
	}

	static int inverS(int a, int b) {

		return ~(a & b);
	}

	static int invrse(int a) {

		return ~a;
	}

	static int leftShift(int a, int b) {

		return a << b;
	}

	static int rightShift(int a, int b) {

		return a >> b;
	}

	static int LogicalrightShift1(int a, int b) {

		return a >>> b;
	}

}
