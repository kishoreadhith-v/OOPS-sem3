package exp7;

import java.util.Scanner;

public class Overloading_numbers {
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Overloading_numbers add = new Overloading_numbers();
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int sum = add.add(a, b);
        System.out.println("Sum of first two numbers: " + sum);
        System.out.print("Enter third number: ");
        int c = input.nextInt();
        sum = add.add(a, b, c);
        System.out.println("Sum of the three numbers: " + sum);
        input.close();
    }
}