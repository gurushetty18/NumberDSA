package welocmeToStrings;

//============================================================
//FIBONACCI SERIES PROGRAM (BEGINNER LEVEL)
//============================================================


//import java.util.Iterator;
//
//public class Fibonacci_series {
//
//	public static void main(String[] args) {
//		int n = 6;
//		int fib1 = 0, fib2 = 1, res = 0;
//		int sum = 0;
//		for (int i = 0; i < n; i++) {
//			res = fib1 + fib2;
//		  for (int j = fib2+1; j < res; j++) {
//			 System.out.print(j+" ");
//		}
//			fib1 = fib2;
//			fib2 = res;
//			System.out.print(res + " ->");
//			sum+=res;
//
//		}
//		System.out.println(sum);
//	}
//}


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//METHOD: Fibonacci (Recursive Implementation)
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

//
//public class Fibonacci_series {
//
//	public static int Fibonacci(int no) {
//		if (no == 0) {
//			return 0;
//		} else if (no == 1 || no == 2) {
//			return 1;
//
//		}
//
//		return Fibonacci(no - 1) + Fibonacci(no - 2);
//
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(Fibonacci(6));
//	}
//}


//============================================================
//FIBONACCI SERIES PROGRAM (i LEVEL)
//============================================================

public class Fibonacci_series{
	
	public static int fibMemo(int n, int[] memo) {
	    if (n == 0) return 0;
	    if (n == 1 || n == 2) return 1;
	    if (memo[n] != 0) return memo[n];
	    memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
	    return memo[n];
	}

	public static void main(String[] args) {
	    int n = 6;
	    int[] memo = new int[n+1];
	    System.out.println(fibMemo(n, memo));
	}

	
}


