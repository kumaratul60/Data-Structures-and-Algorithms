package String.java_basic;

public class S13 {
	public static String AtulconcatWithString() {
		
	String s ="Atul";
	for(int i =0;i<1000;i++)
		s = s+"kumar";
	//System.out.println(s);
	  return s;
	}
		public static String concatWitStringBuffer()
		{
			StringBuffer sb = new StringBuffer("Atul");
			for(int i=0;i<1000;i++)
				sb.append("kumar");
			return sb.toString();
		}
			
			public static void main(String[] args)
			{
				  long startTime = System.currentTimeMillis();  
			       AtulconcatWithString();  
			        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
			        startTime = System.currentTimeMillis();  
			        concatWitStringBuffer();  
			        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
			}
			
		}

