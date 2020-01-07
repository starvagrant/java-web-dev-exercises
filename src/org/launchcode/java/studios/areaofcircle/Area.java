package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius ");
        Double radius = input.nextDouble();
        System.out.println("The area of a circle of radius " + radius + " is : " + Circle.getArea(radius));
    }
}
