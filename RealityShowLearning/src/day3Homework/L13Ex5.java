package day3Homework;

public class L13Ex5 {
    public static void main(String[] args) {
        print(findEmptyStrings(new String[]{"Text1", "Text2", "Text3", ""}));
        print(findEmptyStrings(new String[]{"", "", ""}));
    }

    private static void print(int emptyStrings) {
        System.out.println("Количество пустых строк в массиве: " + emptyStrings);
    }

    private static int findEmptyStrings(String[] strings) {
        int emptyStrings = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].isEmpty()) {
                emptyStrings++;
            }
        }
        return emptyStrings;
    }
}
