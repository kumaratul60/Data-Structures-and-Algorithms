package String.java_basic;

import java.util.StringTokenizer;

public class S3_StrToken {
	public static void main(String[] args) {
		String s = "Hello World";
		StringTokenizer st  = new StringTokenizer(s);
	/* while(st.hasMoreElements())
	{
		System.out.println(st.nextElement());
	} */
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		 String s1 = "Hello*Atul";
			StringTokenizer str  = new StringTokenizer(s1,"*");
		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken());
		}

	}

}
