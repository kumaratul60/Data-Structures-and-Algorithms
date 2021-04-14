package Mathmetics;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class Quadratic {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the a values : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		Quadratic q = new Quadratic();
		q.quadraticRoots(a,b,c);
		System.out.println();
		
		
	}
	 public void quadraticRoots(int a,int b,int c) {
/*
   
     int d  = b*b - 4*a*c; 
    
     double sqrt_val =sqrt(d); 

   
     if (d >= 0) 
     { 
        System.out.println("Roots are real and different \n"); 
  
        System.out.println((int)(-b + sqrt_val) / 2 * a + "\n" 
                            + (double)(-b - sqrt_val) / (2 * a)); 
        
     } 
    
     else // d < 0 
     { 
        System.out.println("Roots are complex \n"); 
  
        System.out.println( -(double)b / ( 2 * a ) + " + i" 
                          + sqrt_val + "\n"  + -(double)b / ( 2 * a ) 
                          + " - i" + sqrt_val); 
     }
     */
		 int r1 = 0,r2 = 0;
		 int d = (int)(Math.pow(b,2)-4*a*c);
		 
		 if(d<0) System.out.println("Imaginary");
		 else
			 
			 r1 = (int)Math.floor((-1*b + Math.sqrt(d))/(2*a));
	    	 r2 = (int)Math.floor((-1*b - Math.sqrt(d))/(2*a));
	    	 
	    	 System.out.println(r1+ " " +r2);
	    }

}
