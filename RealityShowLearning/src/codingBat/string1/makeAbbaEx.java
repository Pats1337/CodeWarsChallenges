package codingBat.string1;

//Given two strings, a and b, return the result of putting them together in the order abba,
// e.g. "Hi" and "Bye" returns "HiByeByeHi".

public class makeAbbaEx {
    public static void main(String[] args) {
        print(makeAbba("Hi", "Bobby"));
        print(makeAbba("Yo", "Alice"));
        print(makeAbba("What", "Up"));
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
