package welocmeToStrings;

import java.util.HashSet;

public class LongestSubStringWR {

	
	public static void LongestSubStrig() {
		String word = "asdlfkasjiuexnknakiwegnsmdsi";
		HashSet<Character> s = new HashSet<Character>();
		int start=0;
		int left = 0 ;
		int maxlength = 0;
		
		for (int right = 0; right < word.length(); right++) {
			while (s.contains(word.charAt(right))) {
				s.remove(word.charAt(left));
				left++;
			}
			
		s.add(word.charAt(right));
		int currentLength = right - left + 1;
		
		if (currentLength>maxlength) {
			maxlength = currentLength;
			start = left;
		}
		}
		
		
		String LongestSubstring = word.substring(start, start+maxlength);
		System.out.println("longest substring without repeating characters: "+LongestSubstring);
		System.out.println("Length: "+maxlength);
	}
	
	public static void main(String[] args) {
		LongestSubStrig();
	}
}
