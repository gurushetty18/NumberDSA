package welocmeToStrings;

import java.util.Scanner;

public class PalindromWord {

	public static boolean isPalindrom(String word) {

		int i = 0, j = word.length() - 1;
		
		while (i < j) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}

			i++;
			j--;

		}
		
		return true;

	}
	public static void main(String[] args) {
		
		System.out.println("enter the word to check palindrom or not");
		
		Scanner sc = new Scanner(System.in);
		if (isPalindrom(sc.nextLine())) {
			
			System.out.println("the given word is palindrom word");
			
		}
		else
			System.out.println("the word is not palindrom word");
		sc.close();
	}
	
	
}
