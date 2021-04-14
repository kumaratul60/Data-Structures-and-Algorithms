package Arrays;

public class Apprears_once {
	public static void main(String[] args) {
		int a[] = {1,7,5,6,6,7,5,4,4};
		int result = a[0];
		for(int i=1;i<a.length;i++)// remaimber

//		int result = 0;
//		for(int i=0;i<a.length;i++)
		
	         result = result^a[i];
		
		System.out.println("single element is : "+result);
	}

}
