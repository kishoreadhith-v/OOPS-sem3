package exp13;

public class GenericMethods {

    public static <T> void printElement(T element) {
        System.out.println("Element: " + element);
    }

    public static void main(String[] args) {
        printElement(42);

        printElement("Hello, Generics!");

        printElement(3.14);
    }
}