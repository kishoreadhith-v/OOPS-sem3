package exp11;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "William Shakespeare";
        String s2 = "I am a weakish speller";
        AnagramCheck obj = new AnagramCheck();
        if (obj.isAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");            
        }
    }

    boolean isAnagram(String s1, String s2) {
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return (new String(c1).trim()).equals(new String(c2).trim());
    }
}
