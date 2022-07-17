package day2Homework;

public class L11Ex9 {
    public static void main(String[] args) {
        print(checkCondition(-10));
        print(checkCondition(0));
        print(checkCondition(2));
        print(checkCondition(100));
        print(checkCondition(99));
        print(checkCondition(1000));
    }

    private static void print(int x) {
        if (x == -1) {
            System.out.println("Ice");
        } else if (x == 0) {
            System.out.println("Water");
        } else {
            System.out.println("Gas");
        }
    }

    private static int checkCondition(int temp) {
        int x;
        if (temp <= 0) {
            x = -1;
        } else if (temp < 100) {
            x = 0;
        } else {
            x = 1;
        }
        return x;
    }
}
