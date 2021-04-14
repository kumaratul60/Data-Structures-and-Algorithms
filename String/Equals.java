package String;

public class Equals {
	public static void main(String[] args) {
		String s = "helo";
		String p = new String("Helo");
		System.out.println(s == p);
		System.out.println(s = "helo");
		System.out.println(s == "helo");
		System.out.println(s.equals(p));
		System.out.println(s.equalsIgnoreCase(p));

	}

}
