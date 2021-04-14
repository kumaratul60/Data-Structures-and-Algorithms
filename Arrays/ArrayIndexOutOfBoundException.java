package Arrays;

public class ArrayIndexOutOfBoundException {
	public static void main(String[] args) {
		int[] a = new int[2];
		a[0] = 10;
		a[1] = 20;
		for(int i=0;i<=a.length;i++)
			System.out.println(a[i]);
			
		
	}

}
