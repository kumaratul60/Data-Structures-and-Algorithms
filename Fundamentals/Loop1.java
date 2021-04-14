package Fundamentals;

public class Loop1 {
	public static void main(String[] args) {
		
//		int i = 1;
//		for(; ;) {
//			//System.out.printf("%d",i++);
//			System.out.print(i++);
//			if(i>10)
//				break;
//		}
		
//		int x=10, y = 100%90, i;
//		for(i=1;i<=10;i++);
//		if(x!=y);
//		System.out.println( x+" "+y);
		
//		for(int i=0;i<=10; System.out.print(" "+i++));
		
//		int i=0;
//		for(; i<5;i++) System.out.println(i);
		
//		int i=0;
//		for(; i<5;i++); 
//		System.out.println(i);
		
		int sum = 0;
		for(int i = 0,j = 0; i<5 & j<5; ++i, j = i+1 )
			sum += i;
		System.out.println(sum);
	}

}
