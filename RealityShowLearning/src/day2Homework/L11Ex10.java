package day2Homework;

public class L11Ex10 {
    public static void main(String[] args) {
        print(checkLGBT("male", "female"));
        print(checkLGBT("female", "female"));
        print(checkLGBT("male", "male"));
        print(checkLGBT("female", "male"));
    }

    private static void print(boolean checkLGBT) {
        if (checkLGBT) {
            System.out.println("Live happily!");
        } else {
            System.out.println("Sorry, same-sex marriage is illegal in our country");
        }
    }

    private static boolean checkLGBT(String x, String y) {
        return !x.equals(y);
    }
}
