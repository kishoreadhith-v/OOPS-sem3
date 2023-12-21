package exp14;

public class ConcatenateStringsLambda {
    public static void main(String[] args) {
        ConcatenateFunction concatenateFunction = (s1, s2) -> s1 + s2;
        String result = concatenateFunction.concatenate("Hello", "World");
        System.out.println("Concatenated String: " + result);
    }

    interface ConcatenateFunction {
        String concatenate(String s1, String s2);
    }
}