package com.santhosh.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {

        Car.CarBuilder builder = new Car.CarBuilder();
        builder.setColor("red");
        builder.setEngine("normal")
                .setSeats(1)
                .setSunroof(false);

        Car car = new Car(builder);
        System.out.println(car);
        //https://www.youtube.com/watch?v=zVn8stM4jtk
    }
}
