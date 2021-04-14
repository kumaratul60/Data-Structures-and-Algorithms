package Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Seperate_chaining {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while (t-- > 0) {
//			int hashSize = sc.nextInt(); // 10
//			int n = sc.nextInt(); // 6
//			int a[] = new int[n]; // 92 4 14 24 44 91
//			for (int i = 0; i < n; i++)
//				a[i] = sc.nextInt();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			int hashSize = Integer.parseInt(br.readLine().trim());
			int n = Integer.parseInt(br.readLine().trim());
			int a[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(inputLine[i]);
			}
			ArrayList<ArrayList<Integer>> res;
			res = seperateChaining(a, n, hashSize);

			for (int i = 0; i < res.size(); i++) {
				if (res.get(i).size() > 0) {
					System.out.println(i + "->");
					for (int j = 0; j < res.get(i).size() - 1; j++) {
						System.out.print(res.get(i).get(j) + "->");
					}
					System.out.print(res.get(i).get(res.get(i).size() - 1));
					System.out.println();

				}
			}

		}

	}

	static ArrayList<ArrayList<Integer>> seperateChaining(int a[], int n, int hashSize) {
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < hashSize; i++) {
			al.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < n; i++) {
			int j = a[i] % hashSize;
			al.get(j).add(a[i]);
		}
		return al;
	}

	static void seperateChaining(int a[], int n, ArrayList<ArrayList<Integer>> hashTable, int hashSize) {
		for (int i = 0; i < n; i++) {
			int x = a[i] % hashSize;
			int count = 0;
			for (ArrayList<Integer> p : hashTable) {
				if (count == x) {
					p.add(a[i]);
				}
				count++;
			}
		}
	}

}
