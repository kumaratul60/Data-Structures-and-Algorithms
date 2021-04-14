package Fundamentals;

import java.util.Scanner;

public class FacinatingNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      while(t>0){
	        int num = sc.nextInt();
	        int res = num+1;
	        boolean startAgain=false;
	        int[] arr = new int[4];
	        for(int i=3;i>=0;i--){
	            arr[i] = res%10;
	            res/=10;
	        }
	        do{
	          startAgain=false;
	          for(int i =0;i<4;i++){
	            for(int j=i+1;j<4;j++){
	              if(arr[i]==arr[j]){
	                arr[j]++;
	                int k=j+1;
	                while(k<4){
	                  arr[k++]=0;
	                }
	                startAgain = true;
	              }
	            }
	          }
	        }while(startAgain==true);
	        res=0;
	        for(int i=0;i<4;i++){
	          res = res*10 + arr[i];
	        }
	        System.out.println(res);
	        t--;
	      }
	}

}
