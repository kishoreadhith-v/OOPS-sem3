package exp12;

import java.io.IOException;

public class CharInput {
    public static void main(String[] args) {
        try {
            char c;
            System.out.println("Enter a character: ");
            c = (char) System.in.read();
            System.out.println("You entered: " + c);
        } catch (IOException e) {
            System.out.println("Error reading from user" + e);
        }
    }
}
