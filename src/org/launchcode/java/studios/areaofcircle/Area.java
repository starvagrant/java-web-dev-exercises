package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        boolean inputCorrect = true;
        Double radius = null;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a radius ");
            String userInput = input.nextLine();
            try {
                radius = Double.valueOf(userInput);
                if (radius < 0) {
                    throw new NumberFormatException();
                }
                inputCorrect = true;
            } catch (NumberFormatException e) {
                System.out.println("Enter a positive real numbers only");
                inputCorrect = false;
            }
        } while (!inputCorrect);
        System.out.println(Circle.getArea(radius));
    }
}
