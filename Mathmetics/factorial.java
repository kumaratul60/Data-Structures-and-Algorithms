package Mathmetics;

public class factorial {
	public static void main(String[] args) {
		
		// int = 2147483647 --> 13
		// long = 9223372036854775807 --> 18
		
		for(int i=0;i<=14;i++) {
		int fact = 1;
			//long fact = 1;
		for(int j=1;j<=i;j++)
			fact = fact*j;
		System.out.println(i+"--> "+fact);
		}
	}

}
