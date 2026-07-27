package welocmeToStrings;

public class ReverseVowels {

	public static  String Reverse(String word) {
		char[] ch = word.toCharArray();
		int i = 0 ;
		int j = ch.length-1;
		
		while (i<j) {
			while (i<j && !isVowels(ch[i])) {
				i++;
				
			}
			while (i<j && !isVowels(ch[j])) {
				j--;
			}
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			
			i++;
			j--;
			
			
		}
		
		return new String(ch);
		
	}
	
	public static boolean isVowels(char c) {
		return "aeiouAEIOU".indexOf(c)!=-1;
		
	}
	
	
	public static void main(String[] args) {
		String result = Reverse("chi tapaka dam dam");
		System.out.println(result);
	}
	
}
