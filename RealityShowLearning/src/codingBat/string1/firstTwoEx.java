package codingBat.string1;

//Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
// If the string is shorter than length 2, return whatever there is, so "X" yields "X",
// and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

public class firstTwoEx {
    public static void main(String[] args) {
        print(firstTwo("Hello"));
        print(firstTwo("ab"));
        print(firstTwo(""));
        print(firstTwo("Kitty"));
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static String firstTwo(String str) {
        String newStr;
        if (str.length() > 2) {
            newStr = str.substring(0, 2);
        } else {
            newStr = str;
        }
        return newStr;
    }
}
