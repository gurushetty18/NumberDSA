package welocmeToStrings;


//============================================================
//DSA LEVELEL PROGRAM 
//============================================================

//public class ReverseTheGivenString {
//	
//	public static String Reverse(String word) {
//		char[] ch=word.toCharArray();
//		int i =0; int j=ch.length-1;
//		while (i<j) {
//			char temp = ch[i];
//			ch[i] = ch[j];
//			ch[j] = temp;
//			i++;
//			j--;
//		}
//		return new String(ch);
//	}
//	
//	public static void main(String[] args) {
//	String result =	ReverseTheGivenString.Reverse("hello macha");
//	System.out.println(result);
//	}
//
//}

//============================================================
//DSA pro level LEVELEL PROGRAM f
//============================================================


public class ReverseTheGivenString{
	
	
	public static String Reverse(String word) {
		
		StringBuilder sb = new StringBuilder(word);
		 return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(ReverseTheGivenString.Reverse("madam"));
	}
	
}