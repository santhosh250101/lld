package com.santhosh.designpatterns.creational.singleton.normal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        DebugLogger logger1 = DebugLogger.getLogger();
        logger1.message("happy");

        DebugLogger logger2 = DebugLogger.getLogger();
        logger2.message("byeye");
    }
}
