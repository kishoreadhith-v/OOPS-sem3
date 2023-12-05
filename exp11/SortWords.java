package exp11;

import java.util.Arrays;

public class SortWords {
    public static void main(String[] args) {
        String s = "This is a test string";
        SortWords obj = new SortWords();
        System.out.println(obj.sortWords(s)); 
    }

    String sortWords(String s) {
        String[] arr = s.split(" ");
        Arrays.sort(arr);
        String sorted = "";
        for(int i = 0; i < arr.length; i++) {
            sorted += arr[i] + " ";
        }
        return sorted;
    }
}
