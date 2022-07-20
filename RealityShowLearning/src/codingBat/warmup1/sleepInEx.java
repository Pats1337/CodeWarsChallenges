package codingBat.warmup1;

// The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
// We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

public class sleepInEx {
    public static void main(String[] args) {
        print(sleepIn(false, false));
        print(sleepIn(true, false));
        print(sleepIn(false, true));
        print(sleepIn(true, true));
    }

    private static void print(boolean x) {
        System.out.println(x);
    }

    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

}
