package com.example.exceptions;

import java.util.Scanner;

public class ScenarioHandler {

    public void handleScenario1(Scanner scanner) {
        System.out.println("Scenario 1: For valid index (0-100):");
        System.out.println("Enter the index");

        try {
            int index = scanner.nextInt();

            if (index >= 0 && index <= 100) {
                System.out.println("index: " + index);
            } else {
                System.out.println("Invalid input for Scenario 1. Please try again.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Clear invalid input
        }
    }

    public void handleScenario2(Scanner scanner) {
        System.out.println("Scenario 2: For negative index:");
        System.out.println("Enter the index");

        try {
            int index = scanner.nextInt();

            if (index < 0) {
                System.out.println("Index cannot be negative");
            } else {
                System.out.println("Invalid input for Scenario 2. Please try again.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Clear invalid input
        }
    }

    public void handleScenario3(Scanner scanner) {
        System.out.println("Scenario 3: For index > 100:");
        System.out.println("Enter the index");

        try {
            int index = scanner.nextInt();

            if (index > 100) {
                System.out.println("Index " + index + " is invalid");
            } else {
                System.out.println("Invalid input for Scenario 3. Please try again.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Clear invalid input
        }
    }
}