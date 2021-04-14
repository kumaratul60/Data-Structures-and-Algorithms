package Arrays;

public class MergeTwoArray {
	public static void main(String[] args) {
		
		int a[] = {2,6,4,0,8,9};
		int b[] = {6,8,9,7,2,35};
		
		int a1 = a.length;
		int  b1 =b.length;
		
		int c1 = a1+b1;
		
		int c[] = new int[c1];
		
		for(int i=0;i<=a.length-1;i++)
			c[i] = a[i];
		
		for(int i=0;i<b1;i++)
			c[a.length+i] = b[i];
		
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+",");
		
	}

}
