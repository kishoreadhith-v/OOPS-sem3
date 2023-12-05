package exp11;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        // 1. String Concatenation
        System.out.println("1. String Concatenation");
        System.out.println(s1 + s2);
        // 2. String Concatenation with other data types
        System.out.println("2. String Concatenation with other data types");
        System.out.println(s1 + 1);
        System.out.println(s1 + 1.0);
        System.out.println(s1 + 'a');
        System.out.println(s1 + true);
        // 3. String Conversion and toString() method
        System.out.println("3. String Conversion and toString() method");
        System.out.println(s1.toString());
        // 4. Character Extraction
        System.out.println("4. Character Extraction");
        // a. charAt()
        System.out.println("a. charAt()");
        System.out.println(s1.charAt(0));
        // b. getChars()
        System.out.println("b. getChars()");
        char[] ch = new char[10];
        s1.getChars(0, 3, ch, 0);
        System.out.println(ch);
        // c. getBytes()
        System.out.println("c. getBytes()");
        byte[] b = s1.getBytes();
        for (byte i : b) {
            System.out.println(i);
        }
        // d. toCharArray()
        System.out.println("d. toCharArray()");
        char[] c = s1.toCharArray();
        for (char i : c) {
            System.out.println(i);
        }
        // 5. String Comparison
        System.out.println("5. String Comparison");
        // a. equals() and equalsIgnoreCase()
        System.out.println("a. equals() and equalsIgnoreCase()");
        s1 = "Hello";
        s2 = "hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        // b. regionMatches()
        System.out.println("b. regionMatches()");
        s1 = "Hello";
        s2 = "Hello World";
        System.out.println(s1.regionMatches(0, s2, 0, 5));
        // c. startsWith() and endsWith()
        System.out.println("c. startsWith() and endsWith()");
        System.out.println(s1.startsWith("He"));
        System.out.println(s1.endsWith("lo"));
        // d. equals() and ==
        System.out.println("d. equals() and ==");
        s1 = "Hello";
        s2 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        // e. compareTo()
        System.out.println("e. compareTo()");
        System.out.println(s1.compareTo(s2));
        // 6. Searching Strings
        System.out.println("6. Searching Strings");
        // 7. Modifying a string
        System.out.println("7. Modifying a string");
        // a. substring()
        System.out.println("a. substring()");
        s1 = "Hello World";
        System.out.println(s1.substring(0, 5));
        // b. concat()
        System.out.println("b. concat()");
        s1 = "Hello";
        s2 = "World";
        System.out.println(s1.concat(s2));
        // c. replace()
        System.out.println("c. replace()");
        s1 = "Hello World";
        System.out.println(s1.replace('l', 'L'));
        // d. trim()
        System.out.println("d. trim()");
        s1 = "   Hello World   ";
        System.out.println(s1.trim());
        // 8. Data Conversion using valueOf()
        System.out.println("8. Data Conversion using valueOf()");
        System.out.println(String.valueOf(1));
        System.out.println(String.valueOf(1.0));
        System.out.println(String.valueOf('a'));
        System.out.println(String.valueOf(true));
        // 9. Changing the case of characters within a string
        System.out.println("9. Changing the case of characters within a string");
        s1 = "Hello World";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        // 10. StringBuffer
        System.out.println("10. StringBuffer");
        // a. StringBuffer Constructors
        System.out.println("a. StringBuffer Constructors");
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Hello");
        StringBuffer sb3 = new StringBuffer(10);
        // b. length() and capacity()
        System.out.println("b. length() and capacity()");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        // c. ensureCapacity()
        System.out.println("c. ensureCapacity()");
        sb2.ensureCapacity(20);
        System.out.println(sb2.capacity());
        // d. setLength()
        System.out.println("d. setLength()");
        sb2.setLength(2);
        System.out.println(sb2);
        // e. charAt() and setCharAt()
        System.out.println("e. charAt() and setCharAt()");
        System.out.println(sb2.charAt(0));
        sb2.setCharAt(0, 'H');
        System.out.println(sb2);
        // f. getChars()
        System.out.println("f. getChars()");
        char[] ch1 = new char[10];
        sb2.getChars(0, 2, ch1, 0);
        System.out.println(ch1);
        // g. append()
        System.out.println("g. append()");
        sb2.append(" World");
        System.out.println(sb2);
        // h. insert()
        System.out.println("h. insert()");
        sb2.insert(0, "Hello");
        System.out.println(sb2);
        // i. reverse()
        System.out.println("i. reverse()");
        sb2.reverse();
        System.out.println(sb2);
        // j. delete() and deleteCharAt()
        System.out.println("j. delete() and deleteCharAt()");
        sb2.delete(0, 5);
        System.out.println(sb2);
        sb2.deleteCharAt(0);
        System.out.println(sb2);
        // k. replace()
        System.out.println("k. replace()");
        sb2.replace(0, 2, "Hello");
        System.out.println(sb2);
        // l. substring()
        System.out.println("l. substring()");
        System.out.println(sb2.substring(0, 5));        
    }
}