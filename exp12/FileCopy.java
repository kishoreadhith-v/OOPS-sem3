package exp12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try (FileReader sourceReader = new FileReader("source.txt");
             FileWriter destinationWriter = new FileWriter("destination.txt")) {
            int character;
            while ((character = sourceReader.read()) != -1) {
                destinationWriter.write(character);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}