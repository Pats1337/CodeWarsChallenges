package Day2Homework;

public class L11Ex11 {
    public static void main(String[] args) {
        print(stringComparison("equal", "equal"));
        print(stringComparison("equal1", "equal"));
        print(stringComparison("equal", "equal1"));
        print(stringComparison("", "equal"));
        print(stringComparison("equal", ""));
        print(stringComparison("", ""));
    }

    private static void print(boolean stringComparison) {
        System.out.println(stringComparison);
    }

    private static boolean stringComparison(String s, String s1) {
        return (!s.isEmpty() || !s1.isEmpty()) & s.equals(s1);
    }
}
