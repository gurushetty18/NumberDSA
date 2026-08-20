package welocmeToStrings;

public class RemoveElement {

	public static int removeElement(int[] arr, int val) {

		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != val) {

				arr[count++] = arr[i];
			}
		}
		return count;

	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 3, 2, 3, 1 };
		int val = 3 ;
		
		System.out.println(removeElement(arr, val));
	}
}
