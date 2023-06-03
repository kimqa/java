package org.example;

abstract class Abstraction {
    protected String color;
    public Abstraction(String color) {
        this.color = color;
    }
    public abstract double getArea();

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + getArea());
    }
}

class Circle extends Abstraction {
    private double radius;
    public Circle( String color,double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Abstraction {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

 class MainAbs {
    public static void main(String[] args) {
        Abstraction circle = new Circle("Red", 5.0);
        Abstraction rectangle = new Rectangle("Blue", 4.0, 6.0);

        circle.display();
        System.out.println("--------------------");
        rectangle.display();
    }
}

