package exp14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringsLambda {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("Orange");
        System.out.println("Unsorted Strings: " + stringList);
        Collections.sort(stringList, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted Strings: " + stringList);
    }
}