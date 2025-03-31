package com.santhosh.designpatterns.creational.abstractfactory;

public class HondaFactory implements  VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Honda();
    }
}
