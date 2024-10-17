package tut04;

public class CheckISBN {
    public static void main(String[] args) {
        System.out.println(checkISBN(""));
        System.out.println(checkISBN(null));
        System.out.println(checkISBN("0123456789"));
        System.out.println(checkISBN("ISANUMBER"));
        System.out.println(checkISBN("01 23 456"));
        System.out.println(checkISBN("13-56-78@"));
        System.out.println(checkISBN("013601267"));
        System.out.println(checkISBN("013031997"));
    }

    public static String checkISBN(String isbn) {
        if (isbn == null || isbn.length() < 9) {
            return "Invalid ISBN: Empty or argument that is too short.";
        }
        else if (isbn.length() > 9) {
            return "Invalid ISBN: The argument is too long.";
        }
        else if (isbn.contains(" ")) {
            return "Invalid ISBN: Space within the argument.";
        }

        else if (!isbn.matches("[0-9]+")) {
            return "Invalid ISBN: Special characters are not allowed.";
        }
        else if (!isbn.matches(".*[a-zA-Z].")) {
            return "Invalid ISBN: Non-numeric argument.";
        }

        int checksum = 0;
        for (int i = 0; i < 9; i++) {
            checksum += (i + 1) * Character.getNumericValue(isbn.charAt(i));
        }

        checksum = checksum % 11;
        char lastDigit = checksum == 10 ? 'X' : (char) (checksum + '0');

        return isbn + lastDigit;
    }
}
