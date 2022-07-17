package day3Homework;

import java.util.Scanner;

public class L15Ex6 {

    private static final String MENU = "Целые типы переменных\n1. byte\n2. short\n3. char\n4. int\n5. long\n0. Выход\nВыберите необходимый пункт меню: ";
    private static final String BYTE = "Тип byte. Размер: 8 бит. Диапазон: от -128 до 127";
    private static final String SHORT = "Тип short. Размер: 16 бит. Диапазон: от -32768 до 32767";
    private static final String CHAR = "Тип char. Размер: 16 бит. Диапазон: беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)";
    private static final String INT = "Тип int. Размер: 32 бит. Диапазон: от -2147483648 до 2147483647";
    private static final String LONG = "Тип long. Размер: 64 бит. Диапазон: от -9223372036854775808L до 9223372036854775807L";
    private static final String ERROR = "Тип long. Размер: 64 бит. Диапазон: от -9223372036854775808L до 9223372036854775807L";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exit = 0;
        while (exit != 1) {
            print(MENU);
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    print(BYTE);
                    break;
                case 2:
                    print(SHORT);
                    break;
                case 3:
                    print(CHAR);
                    break;
                case 4:
                    print(INT);
                    break;
                case 5:
                    print(LONG);;
                    break;
                case 0:
                    exit = 1;
                    break;
                default:
                    print(ERROR);;
            }

        }
    }

    private static void print(String text){
        System.out.println(text);
    }
}
