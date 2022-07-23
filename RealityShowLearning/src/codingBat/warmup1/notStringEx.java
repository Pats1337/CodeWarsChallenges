package codingBat.warmup1;

public class notStringEx {
    public static void main(String[] args) {
        print(notString("candy"));
        print(notString("not candy"));
        print(notString("not"));
        print(notString("123"));
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static String notString(String str) {
        String newStr;
        if (str.startsWith("not")) {
            newStr = str;
        } else {
            newStr = "not " + str;
        }
        return newStr;
    }
}
