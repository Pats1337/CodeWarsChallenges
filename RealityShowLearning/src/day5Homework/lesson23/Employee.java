package day5Homework.lesson23;

public abstract class Employee {
    private final String name;
    private final int exp;
    private final int stack;

    protected Employee(String name, int exp, int stack) {
        this.name = name;
        this.exp = exp;
        this.stack = stack;
    }

    @Override
    public String toString() {
        return getGrade() + " разработчик " + name +
                ", опыт " + exp + " лет, " +
                "количество технологий " + stack +
                ", зарплата " + getSalary() + " руб.";
    }

    protected abstract String getGrade();
    protected abstract int getSalary();

}
