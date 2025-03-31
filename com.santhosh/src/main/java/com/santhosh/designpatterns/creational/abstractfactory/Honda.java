package com.santhosh.designpatterns.creational.abstractfactory;

public class Honda implements Vehicle{
    @Override
    public void start() {
        System.out.println("Honda start");
    }

    @Override
    public void stop() {
        System.out.println("Honda stop");
    }
}
