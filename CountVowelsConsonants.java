package welocmeToStrings;

public class CountVowelsConsonants {

	public static void Count(String word) {
		int Vcount = 0;
		int Ccount = 0;
		for (int i = 0; i < word.length(); i++) {
			if (isVowel(word.charAt(i))) {
				Vcount++;
				
			}
			else if(Character.isLetter(word.charAt(i))) { 
				Ccount++; // it increment only when consonant 
			}
			
		}
		  
		System.out.println("No of Vowels: "+Vcount +"\nNo of Consonants: "+ Ccount);
		
	}
	
	public static boolean isVowel(char c) {
		return "aeiouAEIOU".indexOf(c) != -1;
		
	}
	
	public static void main(String[] args) {
		Count("gurukumar");
	}
}
