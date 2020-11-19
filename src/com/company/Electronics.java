package com.company;

import java.util.Date;
import java.util.Scanner;

public class Electronics {
    private String manufacturer;
    private String model;
    private int price;
    private Date creationDate;
    private boolean isUnderWarranty;
    private double screenSize;

    public void createBasicCritters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter manufacturer");
        this.manufacturer = scanner.next();
        System.out.println("Enter model");
        this.model = scanner.next();
        System.out.println("Enter price");
        this.price = scanner.nextInt();
        this.creationDate = new Date();
        System.out.println("Enter is the device under warranty: Y for (Yes) or N for (NO)");
        char answer = scanner.next().charAt(0);
        this.isUnderWarranty = (answer == 'y' || answer == 'Y');
        System.out.println("Enter screenSize");
        this.screenSize = scanner.nextDouble();
    }

    public void printInfo() {
        System.out.println("-----------------------------");
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("CreationDate : " + creationDate);
        System.out.println("IsUnderWarranty : " + (isUnderWarranty ? "Yes" : "No"));
        System.out.println("ScreenSize : " + screenSize);
    }

    public Electronics(String manufacturer, String model, int price, Date creationDate, boolean isUnderWarranty, double screenSize) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.creationDate = creationDate;
        this.isUnderWarranty = isUnderWarranty;
        this.screenSize = screenSize;
    }

    public Electronics() {
    }

    public void turnOn() {
        System.out.println("The device is on");
    }

    public void turnOff() {
        System.out.println("The device is off");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isUnderWarranty() {
        return isUnderWarranty;
    }

    public void setUnderWarranty(boolean underWarranty) {
        isUnderWarranty = underWarranty;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
