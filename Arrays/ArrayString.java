package Arrays;

public class ArrayString {
	public static void main(String[] args) {
		String s[] = {"kali","lapi","zalipa","hello"};
		for(int i=0;i<s.length-1;i++)
		{
			boolean b = true;
			for(int j=0;j<s.length-1-i;j++)
			{
				if(s[j].compareTo(s[j+1])>0)
				{
					String temp = s[j];
					s[j]=s[j+1];
					s[j+1]= temp;
					b =false;
					
				}
			}
			if(b) break;
		}
	for(String d:s)
		System.out.print(d+",");
	}

}
