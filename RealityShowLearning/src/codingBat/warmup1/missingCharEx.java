package codingBat.warmup1;

//Given a non-empty string and an int n, return a new string where the char at index n has been removed.
// The value of n will be a valid index of a char in the original string
// (i.e. n will be in the range 0..str.length()-1 inclusive).

public class missingCharEx {
    public static void main(String[] args) {
        print(missingChar("kitten", 1));
        print(missingChar("kitten", 0));
        print(missingChar("kitten", 4));
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
}
