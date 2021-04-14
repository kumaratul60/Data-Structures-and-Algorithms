package Recursion_ADV;

public class Phonedugits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve("23"));

	}
	 public static String[] solve(String digits) {
	       
				letterComb(digits, " ");
				return null;
				
			
	        
	        
	    }
	   static void letterComb(String ques, String ans) {
			if (ques.length() == 0) {
				System.out.print(ans + " ");
				return;
			}

			char ch = ques.charAt(0);
			String req = ques.substring(1);
			String code = getCode(ch);
			for (int i = 0; i < code.length(); i++) {
				letterComb(req, ans + code.charAt(i));
			}

		}
		static String getCode(char ch) {
			if (ch == '2')
				return "abc";
			if (ch == '3')
				return "def";
			if (ch == '4')
				return "ghi";
			if (ch == '5')
				return "jkl";
			if (ch == '6')
				return "mno";
			if (ch == '7')
				return "pqrs";
			if (ch == '8')
				return "tuv";
			if (ch == '9')
				return "wxyz";
			else
				return "";

		}

}
