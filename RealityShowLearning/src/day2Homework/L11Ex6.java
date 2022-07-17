package day2Homework;

public class L11Ex6 {
    public static void main(String[] args) {
        print(ageVerification(-1));
        print(ageVerification(2));
        print(ageVerification(6));
        print(ageVerification(13));
        print(ageVerification(17));
        print(ageVerification(21));
        print(ageVerification(60));
        print(ageVerification(96));
        print(ageVerification(100));

    }

    private static void print(int x) {
        switch (x){
            case -1:
                System.out.println("Sorry, incorrect age");
                break;
            case 1:
                System.out.println("Going to kindergarten today");
                break;
            case 2:
                System.out.println("Going to school today");
                break;
            case 3:
                System.out.println("Going to college today");
                break;
            case 4:
                System.out.println("Going to university today");
                break;
            case 5:
                System.out.println("Going to work today");
                break;
            case 6:
                System.out.println("Going to the clinic today");
                break;
        }
    }

    private static int ageVerification(int age) {
        int x;
        if (age <= 0 || age >= 100){
            x = -1; // check incorrect values
        } else if (age < 6) {
            x = 1; // kindergarten
        } else if (age < 15) {
            x = 2; // school
        } else if (age < 18) {
            x = 3; // college
        } else if (age < 22) {
            x = 4; // university
        } else if (age < 65) {
            x = 5; // job
        } else {
            x = 6; // pension
        }
        return x;
    }
}
