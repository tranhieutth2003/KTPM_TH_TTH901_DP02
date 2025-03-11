package com.decorator.car;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        System.out.println("Creating a Basic Car:");
        Car basicCar = new BasicCar();
        basicCar.assemble();
        System.out.println("\n----------------------------");

        System.out.println("Creating a Sports Car:");
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n----------------------------");

        System.out.println("Creating a Luxury Car:");
        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();
        System.out.println("\n----------------------------");

        System.out.println("Creating a Sports + Luxury Car:");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
