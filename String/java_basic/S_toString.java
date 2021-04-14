package String.java_basic;

public class S_toString {
	int roll;
	String name;
	String city;
	 
	S_toString(int roll,String name,String city) {
		this.roll= roll;
		this.name=name;
		this.city=city;
	}
	public String toString()
	{
	return roll+" "+name+" "+city;
	}
	
	public static void main(String[] args) {
		S_toString s= new S_toString(1,"Atul","brh");
		S_toString s1= new S_toString(2,"kumar","lko");
		System.out.println(s);
		System.out.println(s1);
	}
}