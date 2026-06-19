/**
 * A professional demonstration of Java Type Promotion rules.
 * This class showcases how Java handles mixed-type arithmetic expressions.
 */
public class TypePromotionDemo {

    public static void main(String[] args) {
        processPromotionRules();
    }

    private static void processPromotionRules() {
        System.out.println("=== Java Type Promotion Demonstration ===\n");

        // Rule 1: Small types (byte, short, char) promote to int
        byte smallValue = 40;
        char characterValue = 'a'; // Unicode value 97
        short midValue = 10;

        // Even though they are bytes/shorts/chars, the result is an int
        int resultA = smallValue * characterValue / midValue;
        System.out.println("Result (byte * char / short) promoted to int: " + resultA);

        // Rule 2: Promotion to Float and Double
        float floatValue = 5.5f;
        double doubleValue = 0.1234;
        long longValue = 1000L;

        // Promotion hierarchy: 
        // (float * byte) -> float
        // (integer / double) -> double
        // (double + float) -> double
        double finalResult = (floatValue * smallValue) + (resultA / doubleValue) - (longValue);

        System.out.printf("Complex Expression Result: %.4f%n", finalResult);
        System.out.println("Note: The final variable must be 'double' to accommodate the promotion.");

        // Edge Case: Byte overflow during promotion
        demonstrateOverflowPromotion();
    }

    /**
     * Demonstrates that promotion occurs before the calculation is assigned.
     */
    private static void demonstrateOverflowPromotion() {
        byte b = 50;
        // byte c = b * 2; // This would fail to compile because b * 2 is an 'int'
        int c = b * 2; 

        System.out.println("\n--- Promotion during Calculation ---");
        System.out.println("Byte value 50 multiplied by 2 promoted to int: " + c);
    }
}