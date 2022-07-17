package day3Homework;

public class L14Ex7 {
    public static void main(String[] args) {
        findThis(new String[]{"hola", "hila", "this", "those", "ulala"});
        findThis(new String[]{"hola", "hila", "this", "this", "ulala"});
        findThis(new String[]{"this", "this", "this", "this", "this"});
        findThis(new String[]{});
    }

    private static void findThis(String[] strings) {
        boolean checkMore = false;
        if (strings.length == 0) {
            System.out.println("Error, array is empty!");
        } else {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].equals("this")) {
                    if (checkMore) {
                        System.out.print(", " + i);
                    } else {
                        System.out.print(i);
                    }
                    checkMore = true;
                }
            }
            System.out.println();
        }
    }
}
