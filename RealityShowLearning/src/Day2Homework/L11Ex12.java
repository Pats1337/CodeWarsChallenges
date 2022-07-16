package Day2Homework;

public class L11Ex12 {
    public static void main(String[] args) {
        print(checkUrl("http://google.com"));
        print(checkUrl("some text"));
        print(checkUrl("http:/google.com"));
    }

    private static void print(boolean checkUrl) {
        if (checkUrl) {
            System.out.println("This is a link");
        } else {
            System.out.println("This string is not a link");
        }
    }

    private static boolean checkUrl(String s) {
        return s.startsWith("http://");
    }
}
