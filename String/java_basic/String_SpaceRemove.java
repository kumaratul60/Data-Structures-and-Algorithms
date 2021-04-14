package String.java_basic;

import java.lang.reflect.Array;

public class String_SpaceRemove {
	public static void main(String[] args) {
		String s =  "A t u l i   kumar      ";
	//	s=s.trim();
//******************************************************************
		
	String	str= s.replaceAll("\\s","");
        	System.out.println(str);
        	
//********************************************************************
        /*	char[] sArray = s.toCharArray();
        	String s1 = new String();
        	for(int i=0;i<sArray.length;i++)
        	{
        		//if((sArray[i]!='')&&(sArray!='\t'))
        		//	s1.append(sArray[i]);
        	}
        	String s2 = s1.toString();
        	System.out.println(s2);
        		*/
        			
        	
        	}

}
