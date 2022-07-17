package day3Homework;

import java.util.Scanner;

public class L15Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exit = 0;
        while (exit != 1) {
            System.out.print("Целые типы переменных\n1. byte\n2. short\n3. char\n4. int\n5. long\n0. Выход\nВыберите необходимый пункт меню: ");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Тип byte. Размер: 8 бит. Диапазон: от -128 до 127");
                    break;
                case 2:
                    System.out.println("Тип short. Размер: 16 бит. Диапазон: от -32768 до 32767");
                    break;
                case 3:
                    System.out.println("Тип char. Размер: 16 бит. Диапазон: беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)");
                    break;
                case 4:
                    System.out.println("Тип int. Размер: 32 бит. Диапазон: от -2147483648 до 2147483647");
                    break;
                case 5:
                    System.out.println("Тип long. Размер: 64 бит. Диапазон: от -9223372036854775808L до 9223372036854775807L");
                    break;
                case 0:
                    exit = 1;
                    break;
                default:
                    System.out.println("Такой команды не существует");
            }

        }
    }
}
