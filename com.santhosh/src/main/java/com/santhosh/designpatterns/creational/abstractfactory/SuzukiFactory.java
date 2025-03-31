package com.santhosh.designpatterns.creational.abstractfactory;

public class SuzukiFactory implements  VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Suzuki();
    }
}
