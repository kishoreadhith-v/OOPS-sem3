package exp14;

import java.util.List;

public class MinMaxLambda {
    public static void main(String[] args) {
        MinMaxFunction minMaxFunction = (list) -> {
            int min = list.stream().min(Integer::compareTo).orElse(0);
            int max = list.stream().max(Integer::compareTo).orElse(0);
            return new int[] { min, max };
        };
        int[] result = minMaxFunction.minMax(List.of(10, 257, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Min: " + result[0]);
        System.out.println("Max: " + result[1]);
    }

    interface MinMaxFunction {
        int[] minMax(List<Integer> list);
    }
}