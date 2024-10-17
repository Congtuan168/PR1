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
        if (isbn.length() > 9) {
            return "Invalid ISBN: The argument is too long.";
        }
        if (isbn.contains(" ")) {
            return "Invalid ISBN: Space within the argument.";
        }
        if (!isbn.matches("^[0-9]{9}$")) {
            return "Invalid ISBN: Non-numeric argument.";
        }
        if (!isbn.replaceAll("[0-9]", "").isEmpty()) {
            return "Invalid ISBN: Special characters are not allowed.";
        }



//        if (!isbn.matches("\\\\d{9}")) {
//            return "Invalid ISBN: Special characters are not allowed.";
//        }

        int sum = 0;
        for (int i = 0; i < isbn.length(); i++) {
            sum += Character.getNumericValue(isbn.charAt(i)) * (i + 1);
        }

        int checksumDigit = sum % 11;
        String lastDigit;
        if (checksumDigit == 10) {
            lastDigit = "X";
        } else {
            lastDigit = String.valueOf(checksumDigit);
        }
        return isbn + lastDigit;
    }
}
