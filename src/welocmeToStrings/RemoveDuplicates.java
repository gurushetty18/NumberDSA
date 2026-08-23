package welocmeToStrings;

public class RemoveDuplicates {

	
public static int removeDuplicate(int[] arr) {

	int i = 0 ; 
	for (int num : arr) {
		
		if (i < 2 || num != arr[i-2]) {
			arr[i++] = num ;
		}
	}
	return i ;
}

public static void main(String[] args) {
	int[] nums = {1,1,1,2,2,3} ;
	System.out.println(removeDuplicate(nums));
}
}
