package String.java_basic;

public class StringASCII {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String str = "Aa";
		char[] letters = str.toCharArray(); 
		for (char ch : letters)
		{ 
			sb.append((byte) ch); 
			}
		System.out.println(sb.toString());

	}

}
