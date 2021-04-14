package Arrays;

public class SecondMaxElement {
	public static void main(String[] args) {
	//	int a[]= {23,8,78,56,24,63,452,1,20};
		int a[]= {23,3,78,56,24,69,52,1,20};

		
//***********Normal Method**********************************************************
		
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[1]+"");
		
		
//***********Optimise Method******************************************************
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=secMax;
				secMax=a[i];
			}
			else if(a[i]>secMax && a[i]!=max)
				secMax = a[i];
		}
		if(secMax==Integer.MIN_VALUE)
			System.out.println("no secMax");
		else
			System.out.println("secMax = "+secMax);
      
	}
	
}

