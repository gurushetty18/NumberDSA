package twoPointer_SlidingWindows;

import java.util.Arrays;

public class RemoveDuplicate {
	
	
public static void main(String[] args) {
	
	int[] nums = {0,0,1,1,1,2,2,3,3,4};
	
	int i = 0 ;
	for (int j = 1; j < nums.length; j++) {
		if (nums[j] != nums[i]) {
			i+=1;
			nums[i] = nums[j];
		}
	}
	
	int[] copy = Arrays.copyOfRange(nums, 0, i+1) ;
	System.out.println(Arrays.toString(copy));
	
}



}
