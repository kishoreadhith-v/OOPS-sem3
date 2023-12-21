package exp7new;

class Shape {
    String color;

    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    double radius;

    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

class Triangle extends Shape {
    double base;
    double height;

    @Override
    void draw() {
        System.out.println("Drawing a triangle.");
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        for(int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
    }
}