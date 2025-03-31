package com.santhosh.designpatterns.creational.factory;

public class VehicleFactory {

    public  static Vehicle getVehicle(String vehicleType){
        if(vehicleType.equals("CAR")){
            return new Car();
        }
        else if(vehicleType.equals("BUS")){
            return new Bus();
        }
        else if(vehicleType.equals("BIKE")){
            return new Bike();
        }
        else{
            throw new IllegalArgumentException("unknown vehicle type");
        }
    }
}
