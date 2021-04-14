package Arrays;

public class SimpleSortLList {
	public static void main(String[] args) {
		int a[] = {5,2,1,56,69,45,1,3,0,21};
		int temp;
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
			   System.out.print(a[i]+",");
		}

	}

}
