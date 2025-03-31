package com.santhosh.designpatterns.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new HondaFactory();
        Vehicle hondaVehicle = vehicleFactory.createVehicle();
        hondaVehicle.start();
        hondaVehicle.stop();


    }
}
