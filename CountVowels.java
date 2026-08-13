package welocmeToStrings;

public class CountVowels {

	public static void countVowel(String word) {

		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (isvowel(word.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean isvowel(char c) {
		return "aeiouAEIOU".indexOf(c) != -1;
	}

	public static void main(String[] args) {
		countVowel("hello dad");
	}

}
