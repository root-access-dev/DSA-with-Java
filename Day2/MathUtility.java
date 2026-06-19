import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * A professional implementation of a summation utility.
 * Features: Automatic resource management, input validation, and error handling.
 */
public class MathUtility {

    public static void main(String[] args) {
        new MathUtility().execute();
    }

    /**
     * Orchestrates the user input and calculation logic.
     */
    public void execute() {
        // Use try-with-resources to ensure the Scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("=== Advanced Summation Tool ===");

            double operandA = promptForDouble(scanner, "Enter the first number (a): ");
            double operandB = promptForDouble(scanner, "Enter the second number (b): ");

            double sum = calculateSum(operandA, operandB);

            displayResult(operandA, operandB, sum);

        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    /**
     * Prompts the user for a double and validates the input.
     * * @param scanner The Scanner instance.
     * @param message The prompt message for the user.
     * @return A valid double value.
     */
    private double promptForDouble(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine(); // Clear the buffer
            }
        }
    }

    /**
     * Pure logic method for addition.
     */
    private double calculateSum(double a, double b) {
        return a + b;
    }

    /**
     * Formats and prints the final output.
     */
    private void displayResult(double a, double b, double result) {
        System.out.println("---");
        System.out.printf("Calculation: %.2f + %.2f = %.2f%n", a, b, result);
        System.out.println("Operation completed successfully.");
    }
}
