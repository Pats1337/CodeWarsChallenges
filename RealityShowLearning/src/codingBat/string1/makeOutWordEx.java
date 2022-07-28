package codingBat.string1;

//Given an "out" string length 4, such as "<<>>", and a word,
// return a new string where the word is in the middle of the out string,
// e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and
// going up to but not including index j.

public class makeOutWordEx {
    public static void main(String[] args) {
        print(makeOutWord("<<>>", "Yay"));
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
}
