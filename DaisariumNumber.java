package welocmeToStrings;


//============================================================
//DISARIUM NUMBER PROGRAM
//============================================================

//public class daisariumNumber {
//	
//	
//	public static void main(String[] args) {
//		
//		int number = 135 ;
//		int copy = number , n = copy , sum= 0 , count = 0;
//		while (n>0) {
//			count++;
//			
//			n=n/10;
//			
//		}
//		
//		while (number>0) {
//			
//			int digit = number % 10 ;
//			sum+=Math.pow(digit, count);
//			count--;
//			number=number/10;
//		}
//		
//		if (sum == copy) {
//			System.out.println("the give number : "+copy + " is daisarium number");
//		}
//		else
//			System.out.println("the give number is not daisarium number ");
//
//	}
//
//}

//============================================================
//               DSA LEVELEL PROGRAM
//============================================================

public class DaisariumNumber{
	
	
	public static boolean isDaisarium(int number) {
		
		int count = String.valueOf(number).length();
		int copy = number;
		int sum = 0;
		
		while (number>0) {
			int digit = number % 10;
			sum+=Math.pow(digit, count);
			count -- ;
			number = number / 10 ;
			
		}
		
		if (sum == copy) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		if (isDaisarium(135)) {
			System.out.println("the give number is daisarium number");
			
		}
		else
			System.out.println("Not daisarium Number");
	}
}



        
