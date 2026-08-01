package welocmeToStrings;

public class Guru {
	public static String Compression(char[] ch) {
	    int n = ch.length;
	    if (n == 0) return "";

	    int j = 0;
	    int i = 0;

	    while (i < n) {
	        char present = ch[i];
	        int count = 0;
	        while (i < n && ch[i] == present) {
	            i++;
	            count++;
	        }
	        ch[j++] = present;
	        if (count > 1) {
	            for (char c : String.valueOf(count).toCharArray()) {
	                ch[j++] = c;
	            }
	        }
	    }
	    return new String(ch, 0, j);
	}

	public static void main(String[] args) {
	    char[] a = { 'a', 'a', 'a', 'c', 'c' };
	    System.out.println(Compression(a)); // Output: a3c2
	}

}
