package codingBat.warmup1;

//Given 2 int values, return true if one is negative and one is positive.
// Except if the parameter "negative" is true, then return true only if both are negative.

public class posNegEx {
    public static void main(String[] args) {
        print(posNeg(1, -1, false));
        print(posNeg(-1, 1, false));
        print(posNeg(-4, -5, true));
    }

    private static void print(boolean posNeg) {
        System.out.println(posNeg);
    }

    private static boolean posNeg(int a, int b, boolean negative) {
        boolean x = false;
        if (negative) {
            if (a < 0 && b < 0) {
                x = true;
            }
        } else {
            if (a < 0 ^ b < 0) {
                x = true;
            }
        }
        return x;
    }
}
