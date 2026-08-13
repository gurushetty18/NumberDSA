package welocmeToStrings;

public class MissingNumber {

	
	public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6; // last number in the sequence

        int exceptedSum = n * (n + 1) / 2;
        int actualSum = 0;
int i = 0;
while (i<arr.length) {
	actualSum += arr[i++];
	
}
        int missing = exceptedSum - actualSum;
        System.out.println("Missing number: " + missing);
    }
}
