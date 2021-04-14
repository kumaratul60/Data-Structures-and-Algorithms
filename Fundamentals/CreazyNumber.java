package Fundamentals;

import java.util.Scanner;
/*

An Crazy number is an n-digit positive number such that the sum of its digits raised to the power n is the number itself. 
Write a program to check whether a number is Crazy number or not. 
If number is a Crazy number, print "Yes" else "No". See sample test case given below for more clarification.

N.B: We are assuming all numbers given are in base 10.

Input Specification: 
First input is an interger t denotes number of test cases. 
Next there will be t lines denoting t test cases. 
Each test case line will have a number N for which you have to check whether it is Crazy Number of not.

Output Specification: 
Output contains t lines. ith line output will be either "Yes" or "No" depending on the number in ith test case.

Constraints:  0 < t < 2^31 0 < N < 2^63

Sample Input:
3
153
12
1634

Sample Output:
Yes
No
Yes

Explanation:

There are three test cases. First testcase: 153 is a 3 digit number. So 1^3 + 5^3 + 3^3 = = 1 + 125 + 27 = 153.
So, 157 is Crazy number. Second testcase: 12 is a 2 digit number. So 1^2 + 2^2 = 1 + 4 = 5 != 12. So, 12 is not a Crazy number. 
Third testcase: 1634 is a 4 digit number. So 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634. So, 1634 is a Crazy number.

Hence the ouput is :
Yes
No
Yes
*/

public class CreazyNumber {
	 public static void main(String[] args) 
	    {
	        Scanner sc= new Scanner(System.in);
	        int t=sc.nextInt();
	        long arr[]=new long[t];
	        for (int i=0 ;i<t ;i++ )
	            arr[i]=sc.nextLong();

	        for (int i=0 ;i<t ;i++ )
	        {
	            long temp=arr[i], digit=1, res=0, a=arr[i];
	            while (temp>10)
	            {
	                temp=temp/10;
	                digit++;
	            }
	            temp=arr[i];
	            while (a>0)
	            {
	                temp=a%10;
	                res=res+(long)Math.pow(temp,digit);
	                a=a/10;
	            }            
	            if(res==arr[i]) System.out.println("Yes");
	            else System.out.println("No");
	        }
	    }
}
