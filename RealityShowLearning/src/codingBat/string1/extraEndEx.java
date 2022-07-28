package codingBat.string1;

//Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
// The string length will be at least 2.

public class extraEndEx {
    public static void main(String[] args) {
        print(extraEnd("Hello"));
        print(extraEnd("ab"));
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static String extraEnd(String str) {
        String tripleStr = str.substring(str.length() - 2);
        return tripleStr + tripleStr + tripleStr;
    }
}
