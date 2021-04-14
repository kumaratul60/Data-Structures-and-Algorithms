package Fundamentals;

import java.util.Scanner;

public class HouseNum1 {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		      int n1 = sc.nextInt();
		      if(n1>0)
		      {
		        long[] soln = new long[n1];
		        for(int j=0;j<n1;j++)
		        {
		          long count=0;
		          long n = sc.nextLong();
		          if(n>0)
		          {
		            for(long i=1;i<=n;i++)
		            {
		              long temp=i;
		              while(temp!=0)
		              {
		                temp=temp/10;
		                count++;
		              }
		            }
		            soln[j]=count;
		          }
		        }
		        for(int j=0;j<n1;j++)
		          System.out.println(soln[j]);
		      }
	}

}
