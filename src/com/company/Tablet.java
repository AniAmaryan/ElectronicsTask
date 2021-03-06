package com.company;

import java.util.Scanner;

public class Tablet extends Electronics{
    private boolean hasCamera;
    private double cameraResolution;

    public Tablet() {
        createBasicCritters();
        createTabletCritters();
        System.out.println("Tablet created !!!\n");
    }

    public void createTabletCritters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Has the tablet camera : Y for (Yes) or N for (NO)");
        char answer = scanner.next().charAt(0);
        this.hasCamera = (answer == 'y' || answer == 'Y');
        System.out.println("Enter camera resolution");
        this.cameraResolution = scanner.nextDouble();
    }

    @Override
    public String toString() {
        System.out.println("Has Camera = " + (hasCamera ? "Yes" : "No"));
        System.out.println("Camera Resolution = " + cameraResolution);
        return super.toString();
    }

    @Override
    public void turnOn() {
        System.out.println("The Tablet is on");
    }

    @Override
    public void turnOff() {
        System.out.println("The Tablet is off");
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
}
