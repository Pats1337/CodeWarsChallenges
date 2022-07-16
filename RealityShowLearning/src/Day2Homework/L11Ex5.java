package Day2Homework;

public class L11Ex5 {
    public static void main(String[] args) {
        print(checkAge(18));
        print(checkAge(11));
        print(checkAge(-1));
        print(checkAge(1000));
        print(checkAge(21));
        print(checkAge(90));

    }

    private static boolean checkAge(int age) {
        boolean x;
        if (age >= 18 & age <= 100) {
            x = true;
        } else {
            x = false;
        }
        return x;
    }

    private static void print(boolean x) {
        if (x) {
            System.out.println("Access allowed.");
        } else {
            System.out.println("Access denied. You are a bot");
        }
    }
}
