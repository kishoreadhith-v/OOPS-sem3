package exp6;

import java.util.Scanner;

public class Employee_details {
    static class Employee {
        String name;
        String address;
        String gender;
        int age;

        Employee(){
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("Enter name: ");
                name = input.nextLine();
                System.out.print("Enter address: ");
                address = input.nextLine();
                System.out.print("Enter age: ");
                age = input.nextInt();
                input.nextLine();
                System.out.print("Enter gender: ");
                gender = input.nextLine();
            }
        }
        
        void display(){
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display();
    }
}
