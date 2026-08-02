package welocmeToStrings;

public class StringToInteger {
    public static void main(String[] args) {
        // Example string
        String numberStr = "1234";

        // Method 1: Using Integer.parseInt()
        int num1 = Integer.parseInt(numberStr);
        System.out.println("Using parseInt: " + num1);

        // Method 2: Using Integer.valueOf()
        int num2 = Integer.valueOf(numberStr);
        System.out.println("Using valueOf: " + num2);

        // Method 3: Manual conversion using ASCII values
        int num3 = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            num3 = num3 * 10 + (numberStr.charAt(i) - '0');
        }
        System.out.println("Using ASCII conversion: " + num3);
    }
}

