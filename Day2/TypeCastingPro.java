/**
 * A professional implementation demonstrating Type Casting and Conversion in
 * Java.
 * Includes Widening, Narrowing, and Wrapper-based parsing.
 */
public class TypeCastingPro {

    public static void main(String[] args) {
        demonstrateWidening();
        demonstrateNarrowing();
        demonstrateTypePromotion();
        demonstrateStringParsing();
    }

    /**
     * Widening Casting (Implicit): Small type to Large type.
     * Safe and handled automatically by the Java compiler.
     */
    private static void demonstrateWidening() {
        System.out.println("--- Widening (Implicit) Casting ---");
        int count = 42;

        // Automatic: int -> double
        double price = count;

        System.out.printf("Integer value: %d%n", count);
        System.out.printf("Automatically cast to Double: %.2f%n%n", price);
    }

    /**
     * Narrowing Casting (Explicit): Large type to Small type.
     * Manual casting is required; data loss (truncation) may occur.
     */
    private static void demonstrateNarrowing() {
        System.out.println("--- Narrowing (Explicit) Casting ---");
        double accurateMeasurement = 9.78d;

        // Explicit cast: double -> int
        // Note: The fractional part (.78) will be discarded, not rounded.
        int roundedValue = (int) accurateMeasurement;

        System.out.printf("Original Double: %.2f%n", accurateMeasurement);
        System.out.printf("Manually Cast to Int: %d (Notice data loss)%n%n", roundedValue);
    }

    /**
     * Type Promotion in Expressions:
     * When performing math, Java promotes smaller types to the largest type
     * present.
     */
    private static void demonstrateTypePromotion() {
        System.out.println("--- Arithmetic Type Promotion ---");
        byte basicByte = 40;
        char character = 'a'; // Unicode 97
        int integer = 500;
        float floatingPoint = 5.5f;
        double result;

        // The entire expression is promoted to 'double'
        result = (basicByte * character) + (integer / floatingPoint);

        System.out.printf("Expression Result (Promoted to Double): %.4f%n%n", result);
    }

    /**
     * Parsing Strings (The 'Real-World' Casting):
     * Converting reference types (String) to primitive types safely.
     */
    private static void demonstrateStringParsing() {
        System.out.println("--- String-to-Primitive Parsing ---");
        String serverResponse = "1500";

        try {
            // Using Wrapper class methods
            int parsedInt = Integer.parseInt(serverResponse);
            System.out.println("Successfully parsed String '" + serverResponse + "' to Int: " + parsedInt);
        } catch (NumberFormatException e) {
            System.err.println("Failure: String is not a valid integer.");
        }
    }
}