package tut06;

public class OccurrenceString {
    public static void main(String[] args) {
        System.out.println(countCharacterOccurrences("hello", 'l')); // Output: 2
        System.out.println(countCharacterOccurrences("abcdef", 'z')); // Output: 0
    }

    public static int countCharacterOccurrences(String str, char ch) {
        if (str.isEmpty()) {
            return 0;
        }
        int count = (str.charAt(0) == ch) ? 1 : 0;
        return count + countCharacterOccurrences(str.substring(1), ch);
    }
}
