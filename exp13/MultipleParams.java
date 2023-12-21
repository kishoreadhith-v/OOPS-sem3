package exp13;

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void display() {
        System.out.println("Pair: (" + first + ", " + second + ")");
    }
}

public class MultipleParams {
    public static void main(String[] args) {
        Pair<Integer, String> intStringPair = new Pair<>(10, "Hello");
        intStringPair.display();

        Pair<Double, Character> doubleCharPair = new Pair<>(3.14, 'A');
        doubleCharPair.display();
    }
}