package Fundamentals;

import java.util.Scanner;

public class SettingArrangement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			
			int res = 0;
			res = n%8;
			switch(res) {
		
			case 0:{
				System.out.println(n-1+"SL");
				break;
			}
			case 1:{
				System.out.println(n+3+"LB");
				break;
			}
			case 2 :{
				System.out.println(n+3+"MB");
				break;
			}
			case 3:{
				System.out.println(n+3+"UB");
				break;
			}case 4:{
				System.out.println(n-3+"LB");
				break;
			}case 5:{
				System.out.println(n-3+"MB");
				break;
			}case 6:{
				System.out.println(n-3+"UB");
				break;
			}case 7:{
				System.out.println(n+1+"SU");
				break;
			}
			case 8:{
				System.out.println(n-1+"SL");
				break;
			}
			}
		
		}
	}

}
