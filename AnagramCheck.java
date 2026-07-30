package welocmeToStrings;

import java.util.Arrays;

public class AnagramCheck {

	
	
	public static boolean isAnagram(String word1,String word2) {
		
		if (word1.length() != word2.length()) {
			return false;
		}
		
		char[] ch1=word1.toLowerCase().toCharArray();
		char[] ch2 = word2.toLowerCase().toCharArray();
		Arrays.sort(ch1); Arrays.sort(ch2);
		if (ch1.equals(ch2)) {
			return false;
			
		}
		return true;
		
		
	}
	
	public static void main(String[] args) {
		if (isAnagram("silent","listen")) {
			System.out.println("Anangram");
			
		}
		else
			System.out.println("Not Anagram");
	}
}
 