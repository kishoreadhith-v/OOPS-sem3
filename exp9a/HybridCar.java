package exp9a;

interface CNG_Car{
    public void cng_kit();
    public void drive();
}

interface Petrol_Car{
    public void petrol_kit();
    public void drive();
}

public class HybridCar implements CNG_Car, Petrol_Car{
    public void cng_kit(){
        System.out.println("CNG Kit Installed");
    }

    public void petrol_kit(){
        System.out.println("Petrol Kit Installed");
    }

    public void drive(){
        System.out.println("Driving");
    }

    public static void main(String[] args) {
        HybridCar h = new HybridCar();
        h.cng_kit();
        h.petrol_kit();
        h.drive();
    }
}

