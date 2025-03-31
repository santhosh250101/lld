package com.santhosh.designpatterns.creational.builder;

public class Car {
    private String engine;
    private int wheels;
    private int seats;
    private String color;
    private boolean sunroof;
    private boolean navigationSystem;

    // builder
    Car(CarBuilder builder){
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
        this.navigationSystem = builder.navigationSystem;
    }
    // Getter methods for the fields
    public String getEngine() {
        return engine;
    }
    public int getWheels() {
        return wheels;
    }
    public int getSeats() {
        return seats;
    }
    public String getColor() {
        return color;
    }
    public boolean hasSunroof() {
        return sunroof;
    }
    public boolean hasNavigationSystem() {
        return navigationSystem;
    }
    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats
                + ", color=" + color + ", sunroof=" + sunroof
                + ", navigationSystem=" + navigationSystem + "]";
    }

    // here we have only getters, no setters because this will be tajen care by builder

    public static class CarBuilder{
        private String engine;
        private int wheels = 4; // Default value
        private int seats = 5; // Default value
        private String color = "Black"; // Default value
        private boolean sunroof = false; // Default value
        private boolean navigationSystem = false; // Default value

        // Builder methods to set attributes
        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }
        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }
        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }
        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }
        public CarBuilder setNavigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public  Car build(){
            return new Car(this);
        }
    }
}
