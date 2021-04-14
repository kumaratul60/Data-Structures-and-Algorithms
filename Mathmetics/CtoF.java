package Mathmetics;

public class CtoF {
	public static void main(String[] args) {
		
		CtoF cf = new CtoF();
		System.out.println((int)cf.ctof(48));
	}
		public double ctof(double c) {
			double a = c/5;
			double b = a*9;
			c = b+32;
			
			return c;
		}


}
