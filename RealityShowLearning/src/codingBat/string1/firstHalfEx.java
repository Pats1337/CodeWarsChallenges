package codingBat.string1;

//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

public class firstHalfEx {
    public static void main(String[] args) {
        print(firstHalf("WooHoo"));
        print(firstHalf("WooHo"));
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static String firstHalf(String str) {
        int half = str.length()/2;
        return str.substring(0,half);
    }
}
