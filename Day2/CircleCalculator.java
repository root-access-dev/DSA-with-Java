import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * A professional utility to calculate the area of a circle.
 * Formula: Area = π * r²
 */
public class CircleCalculator {

    public static void main(String[] args) {
        CircleCalculator app = new CircleCalculator();
        app.run();
    }

    /**
     * Executes the main application flow.
     */
    public void run() {
        System.out.println("=== Circle Area Calculator ===");
        
        try (Scanner scanner = new Scanner(System.in)) {
            double radius = fetchValidRadius(scanner);
            double area = calculateArea(radius);
            
            displayResults(radius, area);
        } catch (Exception e) {
            System.err.println("A critical error occurred: " + e.getMessage());
        }
    }

    /**
     * Calculates the area using the formula: π * radius^2
     * @param radius The radius of the circle.
     * @return The calculated area.
     */
    private double calculateArea(double radius) {
        // Using Math.pow for clarity and Math.PI for high-precision π
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Prompts the user for a radius and ensures it is a positive numeric value.
     */
    private double fetchValidRadius(Scanner scanner) {
        double input = -1;
        while (input < 0) {
            try {
                System.out.print("Please enter the radius of the circle: ");
                input = scanner.nextDouble();
                
                if (input < 0) {
                    System.out.println("Error: Radius cannot be negative.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: Please enter a valid decimal number.");
                scanner.nextLine(); // Clear the invalid input from buffer
            }
        }
        return input;
    }

    /**
     * Outputs the result with professional formatting.
     */
    private void displayResults(double radius, double area) {
        System.out.println("----------------------------------");
        System.out.printf("Radius: %.4f%n", radius);
        System.out.printf("Calculated Area: %.4f square units%n", area);
        System.out.println("----------------------------------");
    }
}
