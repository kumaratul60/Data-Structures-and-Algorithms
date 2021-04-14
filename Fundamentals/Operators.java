package Fundamentals;

import java.util.*;
import java.io.*;

public class Operators {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(x<y)
    System.out.println(x+ " is smaller than "+y);
    else if(x>y)
    System.out.println(x+" is greater than "+y);
    else
    System.out.println(x+" is equal to "+y);
  }

}
