package String.java_basic;

public class S7_start {
	public static void main(String[] args) {
		String s = "Awasthi";
		String s1 = new String("Awasthi");
				System.out.println(s.startsWith("A"));
		System.out.println(s.startsWith("z"));
		
		System.out.println(s.endsWith("i"));
		System.out.println(s.endsWith("k"));
		
		System.out.println(s.charAt(4));
		
		System.out.println(s.indexOf("t"));
		System.out.println(s.indexOf("p"));
		
		System.out.println(s.length());
		
		System.out.println(s);
		System.out.println(s1);
	}

}
