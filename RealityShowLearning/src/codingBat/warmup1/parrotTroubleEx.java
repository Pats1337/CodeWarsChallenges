package codingBat.warmup1;

//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
//We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

public class parrotTroubleEx {
    public static void main(String[] args) {
        print(parrotTrouble(true, 6));
        print(parrotTrouble(true, 7));
        print(parrotTrouble(false, 6));
        print(parrotTrouble(true, 21));
        print(parrotTrouble(false, 21));
        print(parrotTrouble(false, 20));
        print(parrotTrouble(true, 23));
        print(parrotTrouble(false, 12));
    }

    private static void print(boolean parrotTrouble) {
        System.out.println(parrotTrouble);
    }

    private static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }
}
