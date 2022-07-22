package day5Homework.lesson23;

public abstract class Employee {
    private final String name;
    private final int exp;
    private final int stack;
    private final EmployeeType type;

    protected Employee(String name, int exp, int stack, EmployeeType type) {
        this.name = name;
        this.exp = exp;
        this.stack = stack;
        this.type = type;
    }

    @Override
    public String toString() {
        return getGrade() + " разработчик " + name +
                ", опыт " + exp + " лет, " +
                "количество технологий " + stack +
                ", зарплата " + getSalary() + " руб.";
    }

    public EmployeeType getGrade(){
        return type;
    }

    protected abstract int getSalary();

}
