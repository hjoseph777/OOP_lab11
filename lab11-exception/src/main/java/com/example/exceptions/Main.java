package com.example.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScenarioHandler scenarioHandler = new ScenarioHandler();

        scenarioHandler.handleScenario1(scanner);
        scenarioHandler.handleScenario2(scanner);
        scenarioHandler.handleScenario3(scanner);

        System.out.println("All scenarios completed. Program exited.");
        scanner.close();
    }
}
