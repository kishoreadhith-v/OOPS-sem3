package exp14;

public class SumLambda {
    public static void main(String[] args) {
        SumFunction sf = (a, b) -> a + b;
        int result = sf.sum(5, 7);
        System.out.println("Sum: " + result);
    }

    interface SumFunction {
        int sum(int a, int b);
    }
}