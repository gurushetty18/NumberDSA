package twoPointer_SlidingWindows;

public class PalindromeCheck {
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false; // mismatch found
            }
            left++;
            right--;
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
