package day5Homework.lesson23;

public class Junior extends Employee{
    protected Junior(String name, int experience, int stack) {
        super(name, experience, stack, EmployeeType.JUNIOR);
    }


    @Override
    protected int getSalary() {
        return 80000;
    }


}
