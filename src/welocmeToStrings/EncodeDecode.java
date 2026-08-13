package welocmeToStrings;

import java.util.Base64;

public class EncodeDecode {
    public static void main(String[] args) {
        String original = "DSA";

        // Encoding
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println("Encoded: " + encoded);

        // Decoding
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("Decoded: " + decoded);
    }
}

