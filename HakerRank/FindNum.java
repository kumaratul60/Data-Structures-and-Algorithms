package HakerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FindNum {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < arrCount; i++) {
			int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
			arr.add(arrItem);
		}

		int k = Integer.parseInt(bufferedReader.readLine().trim());

		String result = Result.findNumber(arr, k);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}

class Result {
	
	public static String findNumber(List<Integer> a, int k) {
		// Write your code here
		String res = "Yes";
		for (int i = 0; i < a.size(); i++) {
			if (k == a.get(i)) {
				res = "YES";
				break;
			} else
				res = "NO";
		}
		return res;

	}

	
	static String findNumber1(List<Integer> arr, int k) {
		for (Integer integer : arr) {
			if (integer == k) {
				return "YES";
			}
		}
		return "NO";
	}

	static String findNumber2(List<Integer> arr, int k) {
		return arr.contains(k) ? "YES" : "NO";
	}

	static String findNumber3(List<Integer> arr, int k) {
		return arr.stream().filter(e -> e == k).findFirst().map(e -> "YES").orElse("NO");
	}

	public static String isListContainsNumber(List<Integer> nums, int n) {
		return nums.stream().anyMatch(el -> el.equals(n)) ? "YES" : "NO";
	}

}
