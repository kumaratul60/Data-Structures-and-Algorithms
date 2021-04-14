package Fundamentals;

import java.util.Scanner;

public class HouseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int t=sc.nextInt();
	      while(t-->0){
	        long n=sc.nextLong();
	        long res=0;
	        for(int i=1;i<=9;i++){
	          if(n<Math.pow(10,i)){
	            for(int j=1;j<i;j++){
	              long d=(long) (Math.pow(10,j)-Math.pow(10,j-1));
	              res+=d*j;
	            }
	          long temp=(long) (n-Math.pow(10,i-1));
	            res+=(temp*i)+i;
	            break;
	          }
	        }
	        System.out.println(res);
	      }
	}

}
