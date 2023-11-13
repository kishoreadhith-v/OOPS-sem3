package exp9a;

interface I1{
    public int add(int a, int b);
}

interface I2{
    public int sub(int a, int b);
}

public class MultipleInheritance implements I1, I2{
    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();
        System.out.println(m.add(1, 2));
        System.out.println(m.sub(1, 2));
    }
    
}
