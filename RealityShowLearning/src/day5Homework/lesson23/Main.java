package day5Homework.lesson23;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory factory = new EmployeeFactory();
        print(
                factory.create("Александр", 11, 20),
                factory.create("Денис", 6, 8),
                factory.create("Люба", 2, 4),
                factory.create("Сергей", 2, 5)
        );

    }

    private static void print(Employee... employees) {
        for (Employee employee : employees) {
            print(employee.toString());
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }
}