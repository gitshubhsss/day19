public class numberOfSpecial {
    public static int numberOfSpecialChars(String word) {
        int count = 0;
        int length = 0;
        // AAABCBC
        String newString = word;
        // AAABCBC
        int i = 0;
        while (i < newString.length()) {
            if (Character.isUpperCase(newString.charAt(i))) {
                if (i != newString.length() - 1) {
                    for (int j = i + 1; j >= 0; j--) {
                        if (newString.toLowerCase().charAt(i) == newString.charAt(j)) {
                            count++;
                            if (count == 1) {
                                length++;
                            }
                        }
                    }
                } else {
                    for (int j = i - 1; j >= 0; j--) {
                        if (newString.toLowerCase().charAt(i) == newString.charAt(j)) {
                            count++;
                            if (count == 1) {
                                length++;
                            }
                        }
                    }
                }
            }
            count = 0;
            i++;
        }
        return length;

    }

    public static void main(String[] args) {
        String str = "aaAbcBC";
        System.out.println(numberOfSpecialChars(str));
    }
}
