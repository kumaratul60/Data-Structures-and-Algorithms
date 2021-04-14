package Mathmetics;

public class DataType {
	public static void main(String[] args) {
		 Double object = new Double("2.4");
	        int a = object.intValue();
	        byte b = object.byteValue();
	        float d = object.floatValue();
	        double c = object.doubleValue();
	        
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(d);
	        System.out.println(c);

	        System.out.println(a + b + c + d );
	}

}
