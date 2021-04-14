package Hashing;

import java.util.Scanner;

public class Quadratic_Probing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int hashSize = sc.nextInt();
			int arraySize = sc.nextInt();

			int a[] = new int[hashSize];

			for (int i = 0; i < arraySize; i++)
				a[i] = sc.nextInt();

			int hashTable[] = new int[hashSize];

			quadraticProbing(hashTable, hashSize, a, arraySize);

			for (int i = 0; i < hashSize; i++)
				System.out.print(hashTable[i] + " ");

			System.out.println();

		}

	}

	static void quadraticProbing(int[] hash, int hash_size, int arr[], int N) {
		// Your code here
		for (int i = 0; i < hash_size; i++) {
			hash[i] = -1;
		}
		int hashfuc = hash_size;
		int key;
		for (int i = 0; i < N; i++) {
			if (hash_size == 0) {
				return;
			}
			key = arr[i] % hashfuc;
			int j = 1;
			while (hash[key] != -1 && hash_size > 0) {
				key = (arr[i] + j * j) % hashfuc;
				j++;
			}
			hash[key] = arr[i];
			hash_size--;
		}

	}

}
