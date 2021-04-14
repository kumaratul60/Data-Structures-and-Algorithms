package Arrays;

public class ArraySum {
	public static void main(String[] args) {
		int a[] = {8,5,6,4,9,3};
			          // {8,3,6,2,5,3}
		           // };
		sum(a);
	}
			public static void sum(int a[])
			{
				int sum = 0;
				for(int i=0;i<a.length;i++) {
					//for(int j=0;j<a.length;j++)
					sum += a[i];		
					System.out.println("Sum of Array is " +sum);

		}

	}
}

