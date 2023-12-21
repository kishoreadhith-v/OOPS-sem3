package exp7new;

class Shape {
    double calculateArea() {
        System.out.println("Calculating area in the base class.");
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        double area = length * width;
        return area;
    }
}

public class ShapesArea {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(5.0, 10.0);

        for (Shape shape : shapes) {
            System.out.println("Area of shape is " + shape.calculateArea());
        }
    }
}
