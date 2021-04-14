package Hashing;

import java.util.Scanner;

public class LinearProbing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {

			int hashSize = sc.nextInt();
			int n = sc.nextInt();

			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			int hashTable[] = new int[hashSize];

			hashTable = linearProbing(a, n, hashSize);

			for (int i = 0; i < hashSize; i++)
				System.out.print(hashTable[i] + " ");

			System.out.println();

		}

	}

	static int[] linearProbing(int a[], int n, int hashSize) {

		int hash[] = new int[hashSize];

		for (int i = 0; i < hashSize; i++) {
			hash[i] = -1;
		}

		int hashfun = hashSize;

		for (int i = 0; i < n; i++) {

			if (hashSize == 0)
				return hash;

			int key = a[i] % hashfun;

			while (hash[key] != -1 && hashSize > 0) {

				key = (key + 1) % hashfun;
			}

			hash[key] = a[i];
			hashSize--;
		}
		return hash;
	}

}
