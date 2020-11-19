package com.company;

import java.util.Scanner;

public class Factory {

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        char option;

        System.out.println("A. Create PC");
        System.out.println("B. Create Notebook");
        System.out.println("C. Create TV");
        System.out.println("D. Create Phone");
        System.out.println("E. Create Tablet");
        System.out.println("X. Exit");

        do {
            System.out.println("Choose an option");
            option = scanner.next().charAt(0);
            switch (option) {
                case 'A':
                    new PC().printInfo();
                    break;
                case 'B':
                    new Notebook().printInfo();
                    break;
                case 'C':
                    new TV().printInfo();
                    break;
                case 'D':
                    new Phone().printInfo();
                    break;
                case 'E':
                    new Tablet().printInfo();
                case 'X':
                    break;
                default:
                    System.out.println();
            }

        } while (option != 'E');
        System.out.println("Thank you for using our service");
    }
}
