package tut06;

import java.util.Scanner;

public class OccurrenceString {
    /**
     * Cách 1: Cho người dùng nhập input string và từ cần check from keyboard, sau đó check
     */
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a list of characters in one line: ");
//        String s = input.nextLine();
//        System.out.print("Enter a character: ");
//        char ch = input.next().charAt(0);
//
//        char[] chars = s.replaceAll(" ", "").toCharArray();
//        System.out.println("The occurrences of '" + ch + "' in \"" + s + "\" = " + count(chars, ch));
//    }
//
//    private static int count(char[] chars, char ch) {
//        return count(chars, ch, chars.length - 1);
//    }
//
//    private static int count(char[] chars, char ch, int high) {
//
//        int count = (chars[high] == ch) ? 1 : 0;
//
//        if (high == 0)
//            return count;
//        else
//            return count + count(chars, ch, high - 1);
//    }
    /**
     * Cách 2: Giải đúng test case trong đề bài
     */
    public static void main(String[] args) {
        System.out.println(countCharacterOccurrences("hello", 'l')); // Output: 2
        System.out.println(countCharacterOccurrences("abcdef", 'z')); // Output: 0
    }

    public static int countCharacterOccurrences(String str, char ch) {
        // Base case: if the string is empty
        if (str.isEmpty()) {
            return 0;
        }

        // Check if the first character matches the specified character
        int count = (str.charAt(0) == ch) ? 1 : 0;

        // Recursive case: count in the rest of the string
        return count + countCharacterOccurrences(str.substring(1), ch);
    }
}
