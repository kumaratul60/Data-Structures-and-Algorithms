package String.java_basic;

public class S12_covertString {
	public static void main(String[] args) {
		
		String s = "Atul";
		//StringBuffer sb = new StringBuffer(s);
		StringBuilder sbd = new StringBuilder(s);
		//sb.append(s);
		sbd.append("kumar");
		System.out.println(sbd);
		
	}

}
