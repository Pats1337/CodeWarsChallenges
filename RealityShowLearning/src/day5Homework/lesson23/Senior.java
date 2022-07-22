package day5Homework.lesson23;

public class Senior extends Employee {
    protected Senior(String name, int experience, int stack) {
        super(name, experience, stack, EmployeeType.SENIOR);
    }

    @Override
    protected int getSalary() {
        return 300000;
    }
}