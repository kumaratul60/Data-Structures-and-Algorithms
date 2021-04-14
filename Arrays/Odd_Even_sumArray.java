package Arrays;

import java.util.ArrayList;

public class Odd_Even_sumArray {
	public static void main(String[] args) {
		int a[] = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				al1.add(a[i]);
			else
				al2.add(a[i]);
			
		}
		     System.out.println("Even no : ");

		for(int i=0;i<al1.size();i++)
		{
			for(int j=i+1;j<al1.size()-1;j++)
			{
				if(a[j]<a[i])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i]+",");
		}
		  
	     int total = 0;
	     int avg = 0;
	   //  System.out.println("Even no : ");
		for(int n : al1)
		{
			 total =total+n;
				avg = total/al1.size();

			//System.out.print(n+",");
		}
		System.out.println("\ntotal no of Even no : "+al1.size());
		System.out.println("sum of total Even no : "+total);
		System.out.println("Average of Even no : "+avg);
		
 
		System.out.println("///////////////////////////////");
		
		 int total1 = 0;
		 int avg1 = 0;
		 System.out.println("Odd no : ");
		for(int n1 : al2)
		{
			total1 = total1+n1;
			avg1 = total1/al2.size();
			System.out.print(n1+",");
		}
		System.out.println("\ntotal no of odd no : "+al2.size());
		System.out.println("sum of total Odd no : "+total1);
		System.out.println("Average of Odd no : "+avg1);
		
		System.out.println("////////////////////////////////////////");
		
		System.out.println("Sorted series : ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[j]<a[i])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i]+",");
           
		}
	
	}

}
