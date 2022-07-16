package Day2Homework;

public class L11Ex14 {

    private static String name;

    public static void main(String[] args) {
        name = "Ivan Ivanov";
        print(checkIvanIvanov(name));
        name = "Denis Petrov";
        print(checkIvanIvanov(name));
        name = "Alex Ivanov";
        print(checkIvanIvanov(name));
        name = "Ivan Sazonov";
        print(checkIvanIvanov(name));
    }

    private static void print(int nameStatus) {
        switch (nameStatus) {
            case 0:
                System.out.println("Error! Empty name.");
                break;
            case 1:
                System.out.println("Sorry, " + name + ", access denied.");
                break;
            case 2:
                System.out.println("C-C-C-COMBO, " + name + ", access denied.");
                break;
            case 3:
                System.out.println("Welcome, " + name + ".");
                break;
        }
    }

    private static int checkIvanIvanov(String name) {
        int nameStatus;
        if (name.isEmpty()) {
            nameStatus = 0;
        } else if (name.startsWith("Ivan") & name.endsWith("Ivanov")) {
            nameStatus = 2;
        } else if (name.startsWith("Ivan") || name.endsWith("Ivanov")) {
            nameStatus = 1;
        } else {
            nameStatus = 3;
        }
        return nameStatus;
    }
}
