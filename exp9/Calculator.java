import java.util.Scanner;

import AdvCalculator.Add_Sub; 
import AdvCalculator.Mult_Div; 

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Add_Sub obj1 = new Add_Sub();
        Mult_Div obj2 = new Mult_Div();
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: " + obj1.add(a, b));
        System.out.println("Difference: " + obj1.sub(a, b));
        System.out.println("Product: " + obj2.mult(a, b));
        System.out.println("Quotient: " + obj2.div(a, b));
    }
}
