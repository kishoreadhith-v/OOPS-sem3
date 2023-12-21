package exp12;

import java.io.BufferedReader;
import java.io.FileReader;

public class ARM {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("source.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }    
}