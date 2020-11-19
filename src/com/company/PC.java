package com.company;

public class PC extends Electronics {

    public PC() {
        createBasicCritters();
        System.out.println("Device created !!!");
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public void turnOn() {
        System.out.println("The PC is on");
    }

    @Override
    public void turnOff() {
        System.out.println("The PC is off");
    }


}
