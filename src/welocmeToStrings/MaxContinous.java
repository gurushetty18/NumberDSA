package welocmeToStrings;

public class MaxContinous {

    public static int longestOnes(int[] arr) {
        int left = 0;   // window start
        int right = 0;  // window end
        int max = 0;

        while (right < arr.length) {
            if (arr[right] == 1) {
                // expand window
                max = Math.max(max, right - left + 1);
            } else {
                // reset window when 0 is found
                left = right + 1;
            }
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 1, 1, 1, 1, 1};
        System.out.println(longestOnes(arr));  
    }
}
