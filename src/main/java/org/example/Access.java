package org.example;

public class Access {

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class Vehicle {
    protected String brand;

    protected void startEngine() {
        System.out.println("Engine started");
    }
}

class MyCar extends Vehicle {
    public void displayBrand() {
        System.out.println("Brand = " + brand);
    }
    public void startMyCar() {
        startEngine();
        System.out.println("My Car started");
    }
}

class StartMyCar {
    public static void main(String[] args) {
        MyCar myCar = new MyCar();
        myCar.displayBrand();
        myCar.startMyCar();
        myCar.startEngine();
    }

}