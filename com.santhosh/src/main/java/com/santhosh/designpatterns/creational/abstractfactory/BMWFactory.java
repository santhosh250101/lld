package com.santhosh.designpatterns.creational.abstractfactory;

public class BMWFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new BMW();
    }
}
