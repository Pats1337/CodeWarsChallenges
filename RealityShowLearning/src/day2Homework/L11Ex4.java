package day2Homework;

public class L11Ex4 {
    public static void main(String[] args) {
        print(checkTriangle(60, 60, 60));
        print(checkTriangle(30, 60, 60));
    }

    private static void print(int x) {
        switch (x) {
            case -1:
                System.out.println("Error, the passed values cannot form a triangle.");
                break;
            case 8900:
                System.out.println("This is an acute-angled triangle");
                break;
            case 8965:
                System.out.println("This is an acute-angled isosceles triangle");
                break;
            case 8960:
                System.out.println("This is an acute-angled equilateral triangle");
                break;
            case 9165:
                System.out.println("This is an obtuse isosceles triangle");
                break;
            case 9130:
                System.out.println("This is an obtuse triangle");
                break;
            case 9065:
                System.out.println("This is an isosceles right triangle");
                break;
            case 9030:
                System.out.println("This is a right triangle");
                break;
        }
    }


    public static int checkTriangle(int a, int b, int c) {
        int x;
        if ((a <= 0 || b <= 0 || c <= 0) || (a + b + c != 180)) {
            x = -1;// Error, the passed values cannot form a triangle.
        } else if (a < 90 & b < 90 & c < 90) {
            if ((a == b & a != c) || (a == c & a != b) || (b == c & b != a)) {
                x = 8965; // An isosceles triangle
            } else if (a == b & a == c) {
                x = 8960; // Equilateral triangle
            } else {
                x = 8900; // Versatile triangle
            }
        } else if (a > 90 || b > 90 || c > 90) {
            if ((a == b & a != c) || (a == c & a != b) || (b == c & b != a)) {
                x = 9165; // An isosceles triangle
            } else {
                x = 9130; // Versatile triangle
            }
        } else {
            if ((a == b & a != c) || (a == c & a != b) || (b == c & b != a)) {
                x = 9065; // An isosceles triangle
            } else {
                x = 9030; // Versatile triangle
            }
        }
        return x;
    }
}

