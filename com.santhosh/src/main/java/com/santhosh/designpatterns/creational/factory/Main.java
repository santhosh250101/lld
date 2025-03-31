package com.santhosh.designpatterns.creational.factory;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicle("CAR");
        vehicle1.start();
        vehicle1.stop();
        Vehicle vehicle2 = VehicleFactory.getVehicle("BIKE");
        vehicle2.start();
        vehicle2.stop();
        Vehicle vehicle3 = VehicleFactory.getVehicle("BUS");
        vehicle3.start();
        vehicle3.stop();

    }
}
