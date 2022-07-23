package codingBat.warmup1;

//Given a non-empty string and an int n, return a new string where the char at index n has been removed.
// The value of n will be a valid index of a char in the original string
// (i.e. n will be in the range 0..str.length()-1 inclusive).

public class notStringEx {
    public static void main(String[] args) {
        print(notString("candy"));
        print(notString("not candy"));
        print(notString("not"));
        print(notString("123"));
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static String notString(String str) {
        String newStr;
        if (str.startsWith("not")) {
            newStr = str;
        } else {
            newStr = "not " + str;
        }
        return newStr;
    }
}
