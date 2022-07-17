package candidate;

public class Main {

    public static String candidateName = "Александр";
    public static int candidateAge = 25;
    public static int desiredSalary = 20_000;
    public static boolean kotlinSkills = false;

    public static void main(String[] args) {
        candidateCheck();
        System.out.println();
    }

    private static void candidateCheck() {
        Hr.check();
    }

    public static void print(String text) {
        System.out.println(text);
    }
}
