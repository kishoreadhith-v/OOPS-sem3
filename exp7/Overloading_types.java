package exp7;

import java.util.Scanner;

public class Overloading_types {
    int sub(int a, int b){
        return a - b;
    }

    double sub(double a, double b){
        return a - b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Overloading_types sub = new Overloading_types();
        System.out.print("Enter two integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Difference(Integers): " + sub.sub(a, b));
        System.out.print("Enter two doubles: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        System.out.println("Difference(Doubles): " + sub.sub(c, d));
        input.close();
    }
}
