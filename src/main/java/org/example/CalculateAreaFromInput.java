package org.example;

import java.util.Scanner;

public class CalculateAreaFromInput {

    public static void main(String[] args){
        double radius;

        System.out.print("Enter a radius: " );
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();

        double area = 22 / 7 * radius * radius;

        System.out.println("The area of a circle with radius " + radius + " is " + area);


    }
}
