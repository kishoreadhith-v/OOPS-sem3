package exp11;

public class StringtoInt {
    public static void main(String[] args) {
        String s = "12345";
        StringtoInt obj = new StringtoInt();
        System.out.println(obj.stringtoInt(s));
    }
    int stringtoInt(String s) {
        return Integer.parseInt(s);
    }
}