# interface in java

- abstraction
- allows multiple inheritance
- loose coupling - definine a method and it's signature separtely

## declaration

```java
interface <interface name> {
  // method signatures and attributes
}
```
[Examples for interface](https://www.geeksforgeeks.org/interfaces-in-java/)

```java
interface Drawable {
  void draw();
}

class Circle implements Drawable {
  void draw(){
    System.out.println("Drawing a circle")
  }
}

class Triangle implements Drawable {
  void draw(){
    System.out.println("Drawing a triangle")
  }
}
```
