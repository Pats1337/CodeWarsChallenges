package Day2Homework;

public class L11Ex3 {
    public static void main(String[] args) {
        print(checkDay(true, true));
        print(checkDay(true, false));
        print(checkDay(false, true));
        print(checkDay(false, false));
    }

    private static void print(int x) {
        if (x == 1) {
            System.out.println("Today is a day off and a holiday, you can sleep as much as you want.");
        } else if (x == 2) {
            System.out.println("Today is only a day off, lots to do around the house, so we set the alarm for 11 a.m.");
        } else {
            System.out.println("Work day! Set the alarm for 6:00 a.m.");
        }
    }

    private static int checkDay(boolean weekend, boolean holiday) {
        int x;
        if ((weekend & holiday) || (!weekend & holiday)) {
            x = 1; // Today is a day off and a holiday, you can sleep as much as you want.
        } else if (weekend & !holiday) {
            x = 2; // Today is only a day off, lots to do around the house, so we set the alarm for 11 a.m.
        } else {
            x = 3; // Work day! Set the alarm for 6:00 a.m.
        }
        return x;
    }
}

