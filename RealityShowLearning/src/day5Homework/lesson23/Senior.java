package day5Homework.lesson23;

public class Senior extends Employee {
    protected Senior(String name, int experience, int stack) {
        super(name, experience, stack);
    }

    @Override
    protected String getGrade() {
        return getClass().getSimpleName();
    }

    @Override
    protected int getSalary() {
        return 300000;
    }
}