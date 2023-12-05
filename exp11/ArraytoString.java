package exp11;

public class ArraytoString {
    public static void main(String[] args) {
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        ArraytoString obj = new ArraytoString();
        System.out.println(obj.arraytoString(arr)); // [H, e, l, l, o]
    }

    String arraytoString(char[] arr){
        String s = "";
        for (char i : arr) {
            s += i;
        }
        return s;
    }
}
