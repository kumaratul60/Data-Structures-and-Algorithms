package Arrays;

import java.util.Scanner;

public class ArraysBasics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		 for(int i=0;i<row;i++) {
			 for(int j=0;j<col;j++) {
				 int marks[][] = new int[row][col];
				 marks[i][j] = i*j;
				 //System.out.println(marks);
				 System.out.println(marks[i][j]);

			 }
		 }
	}
}
