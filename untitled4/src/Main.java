
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Convert string to uppercase
        String s1 = "hello";
        System.out.println("1. Uppercase: " + s1.toUpperCase());

        // 2. Count consonants
        String s2 = "hello world";
        int consonants = 0;

        for (int i = 0; i < s2.length(); i++) {
            char c = Character.toLowerCase(s2.charAt(i));

            if (c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1) {
                consonants++;
            }
        }
        System.out.println("2. Consonants = " + consonants);

        // 3. Count vowels
        String s3 = "hello world";
        int vowels = 0;

        for (int i = 0; i < s3.length(); i++) {
            char c = Character.toLowerCase(s3.charAt(i));

            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            }
        }
        System.out.println("3. Vowels = " + vowels);

        // 4. Count words
        String s4 = "this is a test";
        String[] words = s4.trim().split("\\s+");
        System.out.println("4. Words = " + words.length);

        // 5. First non-repeating character
        String s5 = "aabbcddee";
        boolean found = false;

        for (int i = 0; i < s5.length(); i++) {
            char c = s5.charAt(i);

            if (s5.indexOf(c) == s5.lastIndexOf(c)) {
                System.out.println("5. First non-repeating character: " + c);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("5. No non-repeating character");
        }

        // 6. Remove all digits
        String s6 = "abc123de45";
        System.out.println("6. Without digits: " + s6.replaceAll("\\d", ""));

        // 7. Replace spaces with underscores
        String s7 = "hello world program";
        System.out.println("7. Replaced spaces: " + s7.replace(" ", "_"));

        // 8. Reverse a string
        String s8 = "python";
        String reversed = new StringBuilder(s8).reverse().toString();
        System.out.println("8. Reversed: " + reversed);

        // 9. Check palindrome
        String s9 = "madam";

        if (s9.equals(new StringBuilder(s9).reverse().toString())) {
            System.out.println("9. Palindrome");
        } else {
            System.out.println("9. Not Palindrome");
        }

        // 10. Find the longest word
        String s10 = "I love programming";
        String[] wordArray = s10.split("\\s+");
        String longest = "";

        for (String word : wordArray) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("10. Longest word: " + longest);

        // 11. Convert sentence to Title Case
        String s11 = "I love programming";
        String[] titleWords = s11.split("\\s+");
        String title = "";

        for (String word : titleWords) {
            title += Character.toUpperCase(word.charAt(0))
                    + word.substring(1).toLowerCase() + " ";
        }

        System.out.println("11. Title Case: " + title.trim());

        // 12. Simple arithmetic calculator
        System.out.print("12. Enter expression (example: 45 + 3): ");

        double a = sc.nextDouble();
        String operator = sc.next();
        double b = sc.nextDouble();

        double result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;

            case "-":
                result = a - b;
                break;

            case "*":
                result = a * b;
                break;

            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Division by zero is not allowed");
                    sc.close();
                    return;
                }
                break;

            default:
                System.out.println("Invalid operator");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}
