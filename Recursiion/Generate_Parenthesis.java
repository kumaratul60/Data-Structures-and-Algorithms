package Recursiion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int s = sc.nextInt();
			List<String> ptrn = new ArrayList<>();
			ptrn = generateParenthesis1(s);
			for (String strs : ptrn)
				System.out.print(strs + " ");

		}
	}

	public static List<String> parenthesis(int n) {
		List<String> result = new ArrayList<>();
		int open = n;
		int close = n;
		String output = "";
		helper(open, close, result, output);
		return result;
	}

	static void helper(int open, int close, List<String> res, String curr) {

		if (open == 0 || close == 0) {
			res.add(curr);
			return;
		}

		if (open != 0) {
			String output1 = curr;
			output1 = curr + "(";
			helper(open - 1, close, res, output1);
		}
		if (close > open) {
			String output2 = curr;
			output2 = curr + "(";
			helper(open, close - 1, res, output2);

		}
		return;
	}

	///////////////////////////////// **********************************////////////////////////////////////////

	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		helperFun(result, "", n, n);
		return result;
	}

	static void helperFun(List<String> result, String curr, int open, int close) {
		if (open < 0 || open > close) {
			return;
		}

		if (open == 0 || close == 0) {
			result.add(curr);
			return;
		}

		helperFun(result, curr + "(", open - 1, close);
		helperFun(result, curr + ")", open, close - 1);
	}

///////////////////////////BackTracking****************/////////////////////////////////////////////////////////////
	public static List<String> generateParenthesis1(int n) {
		List<String> ans = new ArrayList<String>();
		backtrack(ans, "", 0, 0, n);
		return ans;
	}

	static void backtrack(List<String> ans, String cur, int open, int close, int max) {
		if (cur.length() == max * 2) {
			ans.add(cur);
			return;
		}

		if (open < max)
			backtrack(ans, cur + "(", open + 1, close, max);
		if (close < open)
			backtrack(ans, cur + ")", open, close + 1, max);
	}
///////////////////////////////////////Closure Number ///////////////////////////////////////////////////
	  public static List<String> generateParenthesis3(int n) {
	        List<String> ans = new ArrayList();
	        if (n == 0) {
	            ans.add("");
	        } else {
	            for (int c = 0; c < n; ++c)
	                for (String left: generateParenthesis3(c))
	                    for (String right: generateParenthesis3(n-1-c))
	                        ans.add("(" + left + ")" + right);
	        }
	        return ans;
	  }
///////////////////////	  
} 
