package com.company;

import java.util.Scanner;

public class Notebook extends Electronics {
    private boolean hasCamera;
    private double cameraResolution;

    public Notebook() {
        createBasicCritters();
        createNotebookCritters();
        System.out.println("Notebook created !!!\n");
    }

    public void createNotebookCritters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Has camera : Y for (Yes) or N for (NO)");
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
        System.out.println("The Notebook is on");
    }

    @Override
    public void turnOff() {
        System.out.println("The Notebook is off");
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
