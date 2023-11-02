package University.department;

public class Staff {
    String name;
    int age;
    public Staff(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
