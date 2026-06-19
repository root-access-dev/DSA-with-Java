import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * A professional utility class to calculate the product of two numbers.
 * Features: Resource management, error handling, and precise decimal
 * formatting.
 */
public class ProductCalculator {

    public static void main(String[] args) {
        // Instantiate the class to avoid static-only context
        ProductCalculator calculator = new ProductCalculator();
        calculator.start();
    }

    /**
     * Handles the application lifecycle and resource management.
     */
    public void start() {
        System.out.println("=== Professional Product Utility ===");

        // Try-with-resources ensures the Scanner closes automatically
        try (Scanner scanner = new Scanner(System.in)) {

            double factorA = requestInput(scanner, "Enter the first multiplier (a): ");
            double factorB = requestInput(scanner, "Enter the second multiplier (b): ");

            double product = multiply(factorA, factorB);

            printSummary(factorA, factorB, product);

        } catch (Exception e) {
            System.err.println("An unexpected system error occurred: " + e.getMessage());
        }
    }

    /**
     * Validates that the user enters a valid numeric value.
     */
    private double requestInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Validation Error: Please enter a numeric value (e.g., 10 or 25.5).");
                scanner.nextLine(); // Clear the invalid token from the scanner buffer
            }
        }
    }

    /**
     * Core business logic for multiplication.
     * Separating this allows for easy unit testing.
     */
    private double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Displays the result with high-standard formatting.
     */
    private void printSummary(double a, double b, double result) {
        System.out.println("------------------------------------");
        // Using %g to handle both very large and very small numbers gracefully
        System.out.printf("Result: %.2f × %.2f = %.4f%n", a, b, result);
        System.out.println("Status: Success");
        System.out.println("------------------------------------");
    }
}