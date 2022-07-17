package day3Homework;

import java.util.Scanner;

public class L15Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в банк!\nДля предоставления кредита необходимо уточнить некоторые данные.");
        System.out.print("Сумма кредита: ");
        int money = scanner.nextInt();
        System.out.print("Заработная плата в месяц: ");
        int salary = scanner.nextInt();
        System.out.print("Срок кредита: ");
        int time = scanner.nextInt();
        if (money <= 150000 && salary >= 25000 && time <= 12){
            System.out.println("Вам одобрен кредит на сумму " + money + " со сроком кредитования " + time + " месяцев.");
        } else if (money > 150000){
            System.out.println("Извините, запрашиваемая сумма превышает максимальную сумму выдачи.\nВ кредитовании ОТКАЗАНО!");
        } else if (salary < 25000){
            System.out.println("Извините, размер Вашей заработной платы меньше минимальной суммы.\nВ кредитовании ОТКАЗАНО!");
        } else {
            System.out.println("Извините, срок кредитования превышает максимальный лимит.\nВ кредитовании ОТКАЗАНО!");
        }
    }
}
