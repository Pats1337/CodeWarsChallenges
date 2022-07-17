package day3Homework;

import java.util.Scanner;

public class L15Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, я HR компании Бандекс.\nДля получения приглашения на работу необходимо ответить на ряд вопросов.");
        while (true) {
            System.out.print("Подскажите, стаж вашей работы: ");
            int exp = scanner.nextInt();
            System.out.print("Знаете ли Вы Kotlin? ");
            String kotlin = scanner.next();
            System.out.print("Умеете пользоваться Git? ");
            String git = scanner.next();
            if (exp >= 3 && kotlin.equals("Да") && git.equals("Да")) {
                System.out.println("Отлично! Вы нам подходите.\nJob offer received");
            } else {
                System.out.println("Мы Вам перезвоним.\nJob rejected");
            }
            break;
        }
    }
}
