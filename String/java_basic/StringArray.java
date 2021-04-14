package String.java_basic;

public class StringArray {
	public static void main(String[] args) {
		String a[] = {"Atul","Deepesh","Ashutosh"};
		for(int i=0;i<a.length;i++)
		{
			boolean b = false;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					String temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					b=true;
					
				}					
			}
			if(b) break;
		}
		for(String s :a)
			System.out.print(s+",");
		
	}

}
