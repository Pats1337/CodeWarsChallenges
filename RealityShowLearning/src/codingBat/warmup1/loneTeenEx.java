package codingBat.warmup1;

//We'll say that a number is "teen" if it is in the range 13..19 inclusive.
// Given 2 int values, return true if one or the other is teen, but not both.

public class loneTeenEx {
    public static void main(String[] args) {
        print(loneTeen(13, 99));
        print(loneTeen(13, 19));
        print(loneTeen(7, 7));
        print(loneTeen(99, 7));
        print(loneTeen(88, 15));

    }

    private static void print(boolean text) {
        System.out.println(text);
    }

    private static boolean loneTeen(int a, int b) {
        boolean x = false;
        if ((a >= 13 && a <= 19)
                ^ (b >= 13 && b <= 19)) {
            x = true;
        }
        return x;
    }
}
