package com.main;


public class enums {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) throws Exception {
        Level myVar = Level.LOW;
        switch (myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
