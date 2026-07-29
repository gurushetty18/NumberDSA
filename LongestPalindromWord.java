//package welocmeToStrings;
//
//public class LongestPalindromWord {
// 
//	public static boolean ispalindrom(String word) {
//		
//		int i = 0 ;
//		int j = word.length()-1;
//		while (i<j) {
//			if (word.charAt(i) != word.charAt(j)) {
//				return false;
//			}
//			i++;
//			j--;
//			
//		}
//		return true;
//		
//	}
//	
//	public static void main(String[] args) {
//		String line = "madam racecar level radar civic rotor refer deified noon kayak";
//		String[] st=line.split(" ");
//		int maxlength = 0 ;
//		String resutlword = "";
//		for (String string : st) {
//			if (ispalindrom(string) && string.length()>= maxlength) {
//				maxlength=string.length();
//				resutlword = string;
//			}
//		}
//		System.out.println("the longest palindrom word is: "+resutlword + "\nwith length "+maxlength);
//	}
//}
package welocmeToStrings;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromWord {

    public static boolean ispalindrom(String word) {
        int i = 0;
        int j = word.length() - 1;
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
        String line = "madam racecar level radar civic rotor refer deified noon kayak";
        String[] st = line.split(" ");
        int maxlength = 0;
        List<String> resultWords = new ArrayList<>();

        for (String string : st) {
            if (ispalindrom(string)) {
                if (string.length() > maxlength) {
                    maxlength = string.length();
                    resultWords.clear(); // reset list
                    resultWords.add(string);
                } else if (string.length() == maxlength) {
                    resultWords.add(string);
                }
            }
        }

        System.out.println("The longest palindrome words are: " + resultWords);
        System.out.println("Length: " + maxlength);
    }
}
