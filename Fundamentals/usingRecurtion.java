package Fundamentals;

import java.util.Scanner;

public class usingRecurtion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(" Please Enter Number of elements in an array : ");
		int Number = sc.nextInt();

		int[] Array = new int[Number];

		System.out.print(" Please Enter " + Number + " elements of an Array  : ");
		for (int i = 0; i < Number; i++) {
			Array[i] = sc.nextInt();
		}
		printAttay(Array, 0, Number);
	}

	public static void printAttay(int[] Array, int Start, int Size) {
		if (Start >= Size) {
			return;
		}

		System.out.println(" Element at Array[" + Start + "] = " + Array[Start]);
		printAttay(Array, Start + 1, Size);

	}

}
