package day5Homework.lesson23;

public class EmployeeFactory {
    public Employee create(String name, int exp, int stack) {
        if (exp > 5 && stack > 10) {
            return new Senior(name, exp, stack);
        } else if (exp > 3 && stack > 5) {
            return new Middle(name, exp, stack);
        } else if (exp > 1 && stack > 3) {
            return new Junior(name, exp, stack);
        } else {
            throw new IllegalArgumentException("Вы слишком слабы, подучитесь еще!");
        }
    }

}
