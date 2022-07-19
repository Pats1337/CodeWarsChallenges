package day5Homework.lesson22;

public class Main {
    public static void main(String[] args) {
        Animal[] animals =  new Animal[3];
        animals[0] = new Dog("Тузик");
        animals[1] = new Duck("Скрудж");
        animals[2] = new Fish("Немо");

        for(Animal animal: animals){
            print(animal.toString());
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
