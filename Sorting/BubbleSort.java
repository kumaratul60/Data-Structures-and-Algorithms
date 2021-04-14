package Sorting;

public class BubbleSort {
public static void main(String[] args) {
	int []a = {7,1,4,8,9,6,2};
	
	//**Simple sorting***********************
/*	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				
			}
		}
		System.out.print(a[i]+",");
	}
	*/
	
// ***********Bubble Sorting****************
  	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-1;j++)

		{
			if(a[j]>a[j+1])
			{
				int temp = a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int item : a)       // printing sorted result
		System.out.print(item+",");

		
	////////////////////////////////////////////////////////////
	

	
//**************Optimize Bubble Sort*********************
	
/*	for(int i=0;i<a.length-1;i++)
	{
		boolean sorted = true;
		
		for(int j=0;j<a.length-1-i;j++)
		{
			if(a[j+1]<a[j])
			{
				int temp = a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
				
				sorted = false;
			}
		}
	     if(sorted) break;
	}
	for(int item : a)
		System.out.print(item+",");
		*/
   }
}
