package exp7;

import java.util.Scanner;

public class Overloading_sequence {
    float multiply(int a, float b){
        return a * b;
    }
    float multiply(float a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Overloading_sequence mul = new Overloading_sequence();
        System.out.print("Enter two numbers(first an int and then a float): ");
        int a = input.nextInt();
        float b = input.nextFloat();
        System.out.println("Product: " + mul.multiply(a, b));
        System.out.print("Enter two numbers(first a float and then an int): ");
        float c = input.nextFloat();
        int d = input.nextInt();
        System.out.println("Product: " + mul.multiply(c, d));
        input.close();
    }
}