package Arrays;

import java.util.Scanner;

public class LargestArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		int s[] = {5,2,89,52,24,26,23,56,20,39,3,58};
		int temp;
		
		for(int i=0;i<s.length;i++)
		System.out.println(s[i]+" ");
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				  if(s[i]>s[j])
				   {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				   } 
			}
		}
         System.out.println("second min element = "+s[1]);
         
        for(int i=0;i<s.length;i++)
 		{
 			for(int j=i+1;j<s.length;j++)
 			{
 				  if(s[i]<s[j])
 				   {
 					temp=s[i];
 					s[i]=s[j];
 					s[j]=temp;
 				}
 			}
 		} 
		 System.out.println("second large element = "+s[1]);

        for(int i=0;i<s.length;i++)
        System.out.print(s[i]+" ");
        
     	}
		 
	}

	


