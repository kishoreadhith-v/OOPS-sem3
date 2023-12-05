package exp11;

public class CountWords {
    public static void main(String[] args) {
        String s = "This is a test string";
        CountWords obj = new CountWords();
        System.out.println(obj.countWords(s)); // 2
    }

    int countWords(String s) {
        return s.split(" ").length;
    }
}
