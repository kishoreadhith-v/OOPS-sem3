package exp7new;

class Animal {
    String name;

    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Mammal extends Animal {
    String furColor;

    void giveBirth() {
        System.out.println("Mammal is giving birth.");
    }
}

class Dog extends Mammal {
  
    String breed;
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class AnimalMammalDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Spike";
        dog.furColor = "Brown";
        dog.breed = "Pug";
        dog.eat();
        dog.giveBirth();
        dog.bark();
    }
}