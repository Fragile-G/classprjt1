package org.example;

import java.util.Scanner;

public class CalculateAreaAndPerimeter {

    public static void main(String[] args) {
        final double MATH_PI = 22 / 7;
        double radius;

        System.out.print("Enter a radius: ");
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();

        double area = MATH_PI * radius * radius;
        double perimeter = 2 * MATH_PI * radius;

        System.out.println("The area of a circle with radius " + radius + " is " + area);
        System.out.println("The perimeter of a circle with radius " + radius + " is " + perimeter);

    }
}