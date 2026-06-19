/**
 * A professional demonstration of Type Conversion in Java.
 * Covers Widening (Automatic) and Narrowing (Manual/Casting) conversions.
 */
public class TypeConversionPro {

    public static void main(String[] args) {
        demonstrateWideningConversion();
        demonstrateNarrowingConversion();
        demonstrateParsingStrings();
    }

    /**
     * Widening Conversion (Implicit):
     * Occurs automatically when passing a smaller type to a larger type.
     * No data loss occurs.
     */
    private static void demonstrateWideningConversion() {
        System.out.println("--- Widening Conversion (Automatic) ---");

        int integerVal = 100;
        // Automatic conversion: int -> long -> double
        long longVal = integerVal;
        double doubleVal = longVal;

        System.out.printf("Integer: %d | Long: %d | Double: %.2f%n%n",
                integerVal, longVal, doubleVal);
    }

    /**
     * Narrowing Conversion (Explicit):
     * Requires a manual cast because you are moving from a larger type
     * to a smaller type, which may result in data loss.
     */
    private static void demonstrateNarrowingConversion() {
        System.out.println("--- Narrowing Conversion (Explicit Casting) ---");

        double preciseDouble = 9.97;

        // Manual cast: double -> int (The fractional part is truncated)
        int truncatedInt = (int) preciseDouble;

        // Manual cast: long -> short (Potential for overflow if value is too large)
        long largeLong = 5000L;
        short narrowedShort = (short) largeLong;

        System.out.printf("Original Double: %.2f | Casted Int: %d%n", preciseDouble, truncatedInt);
        System.out.printf("Original Long: %d | Casted Short: %d%n%n", largeLong, narrowedShort);
    }

    /**
     * String to Primitive Conversion (Parsing):
     * Common in professional apps when handling user input or API responses.
     */
    private static void demonstrateParsingStrings() {
        System.out.println("--- String Parsing (Reference to Primitive) ---");

        String numericInput = "42.75";

        try {
            // Using Wrapper class methods to parse
            double parsedValue = Double.parseDouble(numericInput);
            int roundedValue = (int) parsedValue;

            System.out.println("String Input: " + numericInput);
            System.out.println("Parsed Double: " + parsedValue);
            System.out.println("Casted to Int: " + roundedValue);
        } catch (NumberFormatException e) {
            System.err.println("Error: The string provided is not a valid number.");
        }
    }
}