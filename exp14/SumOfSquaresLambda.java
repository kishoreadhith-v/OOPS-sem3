package exp14;

import java.util.List;

import java.util.Arrays;

public class SumOfSquaresLambda {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        SumOfSquaresFunction sumOfSquaresFunction = list -> new SumOfSquares(
                list.stream().filter(n -> n % 2 != 0).mapToInt(n -> n * n).sum(),
                list.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum()
        );

        SumOfSquares result = sumOfSquaresFunction.calculateSumOfSquares(numberList);
        System.out.println("Sum of Squares of Odd Numbers: " + result.getSumOfOddSquares());
        System.out.println("Sum of Squares of Even Numbers: " + result.getSumOfEvenSquares());
    }

    interface SumOfSquaresFunction {
        SumOfSquares calculateSumOfSquares(List<Integer> list);
    }

    static class SumOfSquares {
        private final int sumOfOddSquares;
        private final int sumOfEvenSquares;

        public SumOfSquares(int sumOfOddSquares, int sumOfEvenSquares) {
            this.sumOfOddSquares = sumOfOddSquares;
            this.sumOfEvenSquares = sumOfEvenSquares;
        }

        public int getSumOfOddSquares() {
            return sumOfOddSquares;
        }

        public int getSumOfEvenSquares() {
            return sumOfEvenSquares;
        }
    }
}