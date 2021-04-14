package Arrays;

public class LargerMaxElement {
	public static void main(String[] args) {
		int a[] = {5,6,5,2,1,7,8,6,6,2,9,8,75};
	/*	int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		//	System.out.print(a[i]+" ");
		
		if(i==1)
			break;
		}
		System.out.println("second largest element = "+a[1]);
		*/
			
		int largest =  Integer.MIN_VALUE;
		int sec_largest = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				sec_largest=largest;
				largest = a[i];
			}
			else if(a[i]>sec_largest && a[i]!=largest)
			{
				sec_largest = a[i];
			
			}
		}
		
		
	}

}
