package day3Homework;

import java.util.Scanner;

public class L15Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 2;
        int diff0, diff1;
        System.out.println("Введите числа образующие арифмитическую прогрессию: ");
        int number = scanner.nextInt();
        int number1 = scanner.nextInt();
        diff0 = number1 - number;
        int lastNum = number1;
        while (count < 10) {
            int number2 = scanner.nextInt();
            diff1 = number2 - lastNum;
            if (diff1 != diff0) {
                System.out.println("Введенные числа не являются арифмитической прогрессией!");
                break;
            }
            lastNum = number2;
            count++;
        }
    }
}
