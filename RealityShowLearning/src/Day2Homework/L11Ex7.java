package Day2Homework;

public class L11Ex7 {
    public static void main(String[] args) {
        print(nameVerification("Александр"));
        print(nameVerification("Антон"));
        print(nameVerification("Денис"));
        print(nameVerification("Семен"));
    }

    private static void print(int x) {
        if (x == 0){
            System.out.println("Sorry, access denied.");
        } else {
            System.out.println("Welcome!");
        }
    }

    private static int nameVerification(String name) {
        int x;
        if (name.equals("Денис") || name.equals("Антон")){
            x = 0;
        } else {
            x = 1;
        }
        return x;
    }
}
