package Arrays;

public class Kth_SmallestElement {
	public static void main(String[] args) {
		int a[] = {6,8,9,7,2,35,2,6,4,0,8,9};
		int k=4;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				if(i==k-1)
				{
					System.out.println("Kth smallest element is "+a[i]);
					break;
				}
			}
		}
		for(int i:a) System.out.print(i+",");

	}

}
