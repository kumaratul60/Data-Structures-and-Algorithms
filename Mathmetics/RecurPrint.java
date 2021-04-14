package Mathmetics;

import java.util.Scanner;

public class RecurPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int o = sc.nextInt(); 
		
	/*	if(i<=10) {
            System.out.printf(" %d ",i++);
           main(null);
        }
        */
		
		new Print().recPri(o);
		System.out.println();
	}
}
		
		class Print {
			public void recPri(int n) {
				if(n==0)
					return;
				recPri(n-1);
				System.out.print(n + " ");
			}
}
