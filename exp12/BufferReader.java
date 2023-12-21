package exp12;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string: ");
            String s = reader.readLine();
            System.out.println("You entered: " + s);
        } catch (Exception e) {
            System.out.println("Error reading from user" + e);
        }
    }
}
