package HakerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class OddNumber {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int l = Integer.parseInt(bufferedReader.readLine().trim());

		int r = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> result = Result1.oddNumbers(l, r);

		for (int i = 0; i < result.size(); i++) {
			bufferedWriter.write(String.valueOf(result.get(i)));

			if (i != result.size() - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}

class Result1 {
	public static List<Integer> oddNumbers(int l, int r) {

		List<Integer> al = new ArrayList<>();
		for (int i = l; i <= r; i++) {
			if (i % 2 != 0)
				al.add(i);
		}
		return al;
	}
}
