package org.example;

public class Inheritance {
    protected String brand;
    protected String color;

    public void text() {
        System.out.println("Some text");
    }
}

 class Car extends Inheritance {
    public int numberOfDoors;

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void displayInfo() {
        System.out.println("Brand = "+ brand);
        System.out.println("Color = " + color);
        System.out.println("Number of doors = " + numberOfDoors);
    }
}

class InheritanceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "BMW";
        car.color = "Black";
        car.setNumberOfDoors(4);
        car.displayInfo();
        car.text();
    }
}
