package welocmeToStrings;

public class ReverseingAlternativeWord {
	
	public static String reverse(String word) {
		StringBuilder sb = new StringBuilder(word);
		return sb.reverse().toString();
	}
	
	
	public static void main(String[] args) {
		String s = "hello hi mam demo";
		String[] t = s.split(" ");
		int i = 0;
		for (int j = i; j < t.length; j+=2) {
			
			t[j]=reverse(t[j]);
			
		}
		
		String res = String.join(" ", t);
		System.out.println(res);
	}

}
