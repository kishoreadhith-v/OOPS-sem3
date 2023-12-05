package exp11;

public class DuplicateChars {
    public static void main(String[] args) {
        String s = "Hello World";
        DuplicateChars obj = new DuplicateChars();
        obj.printDuplicates(s); // l o
    }

    void printDuplicates(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++){
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println(s.charAt(i) + " at index " + i);
                    break;
                }
            }
        }
    }
}
