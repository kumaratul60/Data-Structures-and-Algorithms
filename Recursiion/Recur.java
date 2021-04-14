package Recursiion;

public class Recur {

//	static int fun(int a[], int n) {
//		int x;
//		if (n == 1)
//			return a[0];
//		else
//			x = fun(a, n - 1);
//		if (x > a[n - 1])
//			return x;
//		else
//			return a[n - 1];
//	}
//
//	public static void main(String[] args) {
//		int arr[] = { 12, 10, 30, 50, 100 };
//		System.out.println(fun(arr, 5));
//	}
//*********************************************************************
//	static int sumDigits(int no) {
//		return no == 0 ? 0 : no % 10 + sumDigits(no / 10);
//	}
//
//	public static void main(String[] args) {
//		System.out.println(sumDigits(718));
//	}

	static void fun(int n) {
		if (n > 0) {
			fun(n - 1);
			System.out.print(n);
			fun(n - 1);
		}
	}

	public static void main(String[] args) {
		fun(4);
	}
}
