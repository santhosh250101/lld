package com.santhosh.designpatterns.creational.singleton.threadsafe;

public class Main {
    public static void main(String[] args) {

        Logger logger =Logger.getInstance();
        logger.log("hello world always!");

    }
}
