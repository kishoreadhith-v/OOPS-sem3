package exp9a;

interface I1{
    public void hello(String name);
}

interface I2 extends I1{
    public void bye(String name);
}

public class InterfaceChain {
    void hello(String name){
        System.out.println("Hello " + name);
    }

    void bye(String name){
        System.out.println("Bye " + name);
    }

    public static void main(String[] args) {
        InterfaceChain i = new InterfaceChain();
        i.hello("World");
        i.bye("World");
    }
}
