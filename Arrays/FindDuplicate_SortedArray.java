package Arrays;

public class FindDuplicate_SortedArray {
	public static void main(String[] args) {
		int a[] = {1,1,2,3,3,3,5,5,6,6,8,4};
		//int a[] = {3,1,10,10,10,4,9,9,20,2,2,11,12,13};
		//int temp[] =new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
			//	temp[j] = a[i];
				a[j] = a[i];
				j++;
			}
		}
		//temp[j] = a[a.length-1];
		a[j] = a[a.length-1];
		//for(int i : a) System.out.print(i+",");
	//	for(int i=0;i<a.length;i++)
			for(int i=1;i<j;i++)

			System.out.print(i+",");

	}

}
