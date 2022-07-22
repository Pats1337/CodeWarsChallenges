package day5Homework.lesson23;

public class Middle extends Employee {
    protected Middle(String name, int experience, int stack) {
        super(name, experience, stack, EmployeeType.MIDDLE);
    }

    @Override
    protected int getSalary() {
        return 150000;
    }
}
