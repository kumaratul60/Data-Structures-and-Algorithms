package Arrays;

public class MinMaxArray {
	public static void main(String[] args) {
		int[] a = { 23, 10, 4, 78, 54, 26, 12, 14, 5, 36, 32, 45, 78, 789 };
//		int max =a[0],min = a[0];
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]>max)
//				max=a[i];
//			else if(a[i]<min)
//				min = a[i];
//		}

		int max = -1;
		for (int i = 0; i < a.length; i++) {
//			max = Math.max(max, a[i]);
			if (max < a[i])
				max = a[i];
		}

		System.out.println(max + " ");
		// System.out.println(min+" ");
	}

}
