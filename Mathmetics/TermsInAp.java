package Mathmetics;

// Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
import java.util.Scanner;

public class TermsInAp {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int count =0;
        while(i<=n*2) {
            int temp = 3*i+2;
            if(count==n)
                break;
            if((temp%4) != 0){
                System.out.print(temp+" ");
            count++;
            }
            i+=1;
        }
	}

}
