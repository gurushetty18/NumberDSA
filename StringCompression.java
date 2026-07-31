package welocmeToStrings;

public class StringCompression {

    public static void Compression(char[] ch) {
        int n = ch.length;
        if (n == 0) return;

        int j = 0; // write index

        for (int i = 0; i < n; ) {
            char current = ch[i];
            int count = 0;

            // Count consecutive occurrences
            while (i < n && ch[i] == current) {
                count++;
                i++;
            }

            // Write character
            ch[j++] = current;

            // Write count if > 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    ch[j++] = c;
                }
            }
        }

        // Print only the compressed portion
        System.out.println(new String(ch, 0, j));
    }

    public static void main(String[] args) {
        char[] a = {'a','a','a','c','c'};
        Compression(a); // Output: a3c2
    }
}
