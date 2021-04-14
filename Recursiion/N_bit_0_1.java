package Recursiion;

import java.util.ArrayList;
import java.util.Scanner;

public class N_bit_0_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			String input  = sc.next();
			String output = "";
			int one = 0;
			int zero = 0;
			//solve(one,zero,input,output);
			ArrayList<String> ptrn = new ArrayList<>();
		//	ptrn = solve(one,zero,input,output);
			for (String strs : ptrn)
				System.out.println(strs);
			
		}
	}
	static void solve(int one,int zero,int n,ArrayList<String> output) {
		
		if(n==0) {
			System.out.println(output +" ");
			return;
		}
		ArrayList<String> s1 = output;
		s1.add("1");
		solve(one+1,zero,n-1,s1);
		ArrayList<String> s2 = output;
		s2.add("0");
		solve(one,zero+0,n-1,s2);
	
		return;
	}

}
