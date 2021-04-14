package Matrix;

public class TeoplitzMatrix {
	
	 public static void main(String[] args){
	      int [][] testCase1 = {{1,2,3},{4,5,6},{7,8,9}};
	      int [][] testCase2 = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};

	      System.out.println(isTeoplitzMatrix(testCase1));
	      System.out.println(isTeoplitzMatrix(testCase2));

	   }
	   static boolean isTeoplitzMatrix(int[][] matrix) {
	      for(int row=0; row< matrix.length-1;row++) {
	         for(int col=0;col< matrix[row].length-1;col++) {
	            if(matrix[row][col] != matrix[row+1][col+1])
	               return false;

	            //that method is called as fail-fast method

	         }
	      }
	      return true;
	   }

}
