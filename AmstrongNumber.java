package welocmeToStrings;

//import java.util.Scanner;
//
//public class AmstrongNumber {
//
//	public static void main(String[] args) {
//		
//		System.out.println("enter the number to check amastrong number or not ");
//		Scanner sc = new Scanner(System.in);
//		int no = sc.nextInt();
//		int copy = no , n = no , count = 0, sum = count;
//		
//		while (n>=1) {
//			count++;
//			n= n/10 ;
//		}
//		
//		while (no>=1) {
//			int rem = no%10;
//			sum+=Math.pow(rem, count);
//			no = no/10;
//		}
//		if (sum == copy) {
//			System.out.println("amastrong number");
//		}		
//		else 
//			System.out.println("not amstrong number");
//		
//	}
//}
//
//

//                                DSA level

public class AmstrongNumber{
	
	public static boolean isAmstrong(int n) {
		int copy = n;
		int count = String.valueOf(copy).length();
		int sum = 0;
		
		while (n>0) {
			int last = n %10;
			sum += Math.pow(last, count);
			n = n/10;
		}
		
if (sum == copy) {
	return true;
}
		return false;
	}
	public static void main(String[] args) {
		
		
		if (isAmstrong(153)) {
			System.out.println("the give number is amstrong");
		}
		else 
			System.out.println(" not an amstrong number");
	}
	
	
}
