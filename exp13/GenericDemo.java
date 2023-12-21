package exp13;

class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void display() {
        System.out.println("Pair: (" + first + ", " + second + ")");
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Pair<Integer> intPair = new Pair<>(10, 20);
        intPair.display();

        Pair<String> stringPair = new Pair<>("Hello", "World");
        stringPair.display();
    }
}