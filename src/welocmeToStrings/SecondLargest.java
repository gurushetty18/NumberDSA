package welocmeToStrings;

public class SecondLargest {

	public static int SecondLrg() {
		int[] arr = { 10, 8, 7, 15, 30 };
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		for (int num : arr) {
			
			if (num > largest) {
				secondlargest = largest ;
				largest = num ;
			}
			else if (num > secondlargest && num < largest){
				secondlargest = num ;
			}
		}
		return secondlargest;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(SecondLrg());
	}
}
