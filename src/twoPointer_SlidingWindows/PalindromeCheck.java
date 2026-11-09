package twoPointer_SlidingWindows;

public class PalindromeCheck {
    public static boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end ) {
            if (word.charAt(start) != word.charAt(end)) {
                return false; // mismatch found
            }
            start++;
            end--;
        }
        return true; // all matched
    }

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "hello";

        System.out.println(s1 + " -> " + (isPalindrome(s1) ? "Palindrome" : "Not Palindrome"));
        System.out.println(s2 + " -> " + (isPalindrome(s2) ? "Palindrome" : "Not Palindrome"));
    }
}
