package exp12;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(System.out)){
            writer.println("Hello from print writer");
        } catch (Exception e) {
            System.out.println("Error writing to user" + e);
        }
    }
}
