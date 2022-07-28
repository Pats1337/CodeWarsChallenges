package codingBat.string1;

//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

public class helloNameEx {
    public static void main(String[] args) {
        print(helloName("Bob"));
        print(helloName("Alex"));
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static String helloName(String name) {
        return "Hello, " + name + "!";
    }
}
