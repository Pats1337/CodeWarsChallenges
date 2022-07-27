package codingBat.warmup1;

//Given a string, if the string "del" appears starting at index 1,
// return a string where that "del" has been deleted.
// Otherwise, return the string unchanged.

public class delDelEx {
    public static void main(String[] args) {
        print(delDel("adel"));
        print(delDel("adelHello"));
        print(delDel("a"));
        print(delDel("ad"));
        print(delDel("ade"));
        print(delDel("del"));
        print(delDel(""));
        print(delDel("kvakvavkva"));
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static String delDel(String str) {
        String newStr = str;
        if (str.length() >= 4 && (str.substring(1, 4).equals("del"))){
            newStr = str.substring(0,1) + str.substring(4);
        }
        return newStr;
    }
}
