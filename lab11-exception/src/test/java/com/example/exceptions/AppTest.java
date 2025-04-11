package com.example.exceptions;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.Test;
import java.util.Scanner;
import java.io.ByteArrayInputStream;

/**
 * Unit test for ScenarioHandler.
 */
public class AppTest {

    @Test
    public void testHandleScenario1() {
        String input = "50\n"; // Simulate valid index input
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        ScenarioHandler scenarioHandler = new ScenarioHandler();

        assertDoesNotThrow(() -> scenarioHandler.handleScenario1(scanner));
        scanner.close();
    }

    @Test
    public void testHandleScenario2() {
        String input = "-5\n"; // Simulate negative index input
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        ScenarioHandler scenarioHandler = new ScenarioHandler();

        assertDoesNotThrow(() -> scenarioHandler.handleScenario2(scanner));
        scanner.close();
    }

    @Test
    public void testHandleScenario3() {
        String input = "150\n"; // Simulate index > 100 input
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        ScenarioHandler scenarioHandler = new ScenarioHandler();

        assertDoesNotThrow(() -> scenarioHandler.handleScenario3(scanner));
        scanner.close();
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
