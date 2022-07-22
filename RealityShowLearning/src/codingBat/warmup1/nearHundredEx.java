package codingBat.warmup1;

//Given an int n, return true if it is within 10 of 100 or 200.

public class nearHundredEx {
    public static void main(String[] args) {
        print(nearHundred(93));
        print(nearHundred(90));
        print(nearHundred(89));
        print(nearHundred(200));
        print(nearHundred(-50));
        print(nearHundred(211));
        print(nearHundred(-200));
    }

    private static void print(boolean nearHundred) {
        System.out.println(nearHundred);
    }

    private static boolean nearHundred(int n) {
        return Math.abs(100-n) <= 10 || Math.abs(200-n) <= 10;
    }
}
