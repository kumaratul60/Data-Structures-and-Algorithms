package String.java_basic;

public class S11_PtternMaching {
public static void main(String[] args) {
//	String text = "Atul kumar";
	String text = "Atulkumar";

	String Pattern = "ulku";
	
	boolean result = text.contains(Pattern);
	//boolean result = Pattern.contains(text);
	//boolean result = Pattern.contains(Pattern);
	//boolean result = text.contains(text);

	if(result)
		System.out.println("Pattern found");
	else
	System.out.println("not found");
	
  }
}
