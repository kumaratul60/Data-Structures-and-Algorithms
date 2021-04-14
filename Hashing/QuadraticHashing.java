package Hashing;

public class QuadraticHashing {

	public static void main(String[] args) {
		int arr[] = { 880,995,647,172 };
		int N = 4;

		// Size of the hash table
		int L = 11;
		int hash_table[] = new int[L];

		// Initializing the hash table
		for (int i = 0; i < L; i++) {
			hash_table[i] = -1;
		}

		// Quadratic probing
		quadraticProbing(hash_table, L, arr, N);

	}

	static void quadraticProbing(int[] hash, int hash_size, int a[], int n) {
		for (int i = 0; i < n; i++) {

			int hashVal = a[i] % hash_size;

			if (hash[hashVal] == -1)
				hash[hashVal] = a[i];
			else {
				for (int j = 0; j < hash_size; j++) {

					int t = (hashVal + j * j) % hash_size;

					if (hash[t] == -1) {

						hash[t] = a[i];
						break;
					}
				}
			}
		}
		printArray(hash);
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
