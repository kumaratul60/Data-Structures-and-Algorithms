package Fundamentals;

import java.util.Scanner;

//Given a street of N houses(a row of houses),each house having K amount of money kept inside;
//now there is a thief who is going to steal this money but he has a constraint/rule that
//he cannot steal/rob two adjacent houses.Find the maximum money he can rob.

//Input:
//N = 5 , K = 10
//Output:
//30
//Explanation:
//The Robber can rob from the first, third
//and fifth houses which will result in 30.

public class MaximunMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(((int) Math.ceil((double) n / 2)) * k);

	}

}
