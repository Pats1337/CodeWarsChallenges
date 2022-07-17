package day3Homework;

import java.util.Scanner;

public class L15Ex6 {

    private static final String MENU = "Целые типы переменных\n1. byte\n2. short\n3. char\n4. int\n5. long\n0. Выход\nВыберите необходимый пункт меню: ";
    private static final String BYTE = "Тип byte. Размер: 8 бит. Диапазон: от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE;
    private static final String SHORT = "Тип short. Размер: 16 бит. Диапазон: от " + Short.MIN_VALUE + " до " + Short.MAX_VALUE;
    private static final String CHAR = "Тип char. Размер: 16 бит. Диапазон: беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)";
    private static final String INT = "Тип int. Размер: 32 бит. Диапазон: от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE;
    private static final String LONG = "Тип long. Размер: 64 бит. Диапазон: от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE;
    private static final String ERROR = "Ошибка! Вы ввели некорректную команду";

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
