package com.santhosh.designpatterns.creational.singleton.normal;

public class DebugLogger {
    private static DebugLogger instance;

    private DebugLogger(){}

    public static DebugLogger getLogger(){
        if(instance==null){
            instance = new DebugLogger();
            System.out.println("created new logger");
        }
        return instance;
    }
    public void message(String msg){
        System.out.println("Logging "+ msg);
    }
}
