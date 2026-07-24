package welocmeToStrings;

//public class PrimeNumber {
//
//	public static void main(String[] args) {
//		int no = 17;
//
//		boolean flag = true;
//
//		if (no <= 1) {
//			System.out.println("not prime number");
//			return;
//
//		}
//
//		if (no > 1) {
//
//			for (int i = 2; i <= Math.sqrt(no); i++) {
//				if (no % i == 0) {
//					flag = false;
//					break;
//				}
//
//			}
//
//			if (flag) {
//				System.out.println("prime number");
//			} else
//				System.out.println("not prime");
//		}
//	}
//}

//                          DSA LEVEL
//
//package welocmeToStrings;
//
//public class PrimeNumberDSA {
//
//    public static boolean isPrime(int n) {
//        // Edge cases
//        if (n <= 1) return false;
//        if (n <= 3) return true;
//
//        // Eliminate multiples of 2 and 3
//        if (n % 2 == 0 || n % 3 == 0) return false;
//
//        // Check divisors of form 6k ± 1
//        for (int i = 5; i * i <= n; i += 6) {
//            if (n % i == 0 || n % (i + 2) == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int no = 17;
//        if (isPrime(no)) {
//            System.out.println(no + " is a prime number");
//        } else {
//            System.out.println(no + " is not a prime number");
//        }
//    }
//}
//




public class PrimeNumber{
	
	public static boolean isPrime(int n) {
		
		if (n<=1) return false;
		if (n<=3)  return true;
		
		if (n%2==0 || n %3 == 0) return false;
		
		for (int i = 5; i * i <= n; i+=6) {
			if (n % i == 0 || n % i+2 == 0) {
				return false;
				
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
	
		if (isPrime(71)) {
			System.out.println("prime number");
		}
		else
			System.out.println("in not prime number");
	}
}

