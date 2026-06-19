/**
 * A professional demonstration of all standard Java data types.
 * This class showcases primitives, wrappers, and common reference types.
 */
public class DataType {

    public static void main(String[] args) {
        displayPrimitiveTypes();
        displayReferenceTypes();
    }

    /**
     * Demonstrates the 8 primitive data types in Java.
     * Primitives are the most basic data types predefined by the language.
     */
    private static void displayPrimitiveTypes() {
        System.out.println("--- Primitive Data Types ---");

        // 1. byte: 8-bit signed integer (-128 to 127)
        byte smallNumber = 125;

        // 2. short: 16-bit signed integer
        short midRangeNumber = 32_000;

        // 3. int: 32-bit signed integer (Default for whole numbers)
        int standardInteger = 2_147_483_647;

        // 4. long: 64-bit signed integer (Requires 'L' suffix)
        long largeNumber = 9_223_372_036_854_775_807L;

        // 5. float: 32-bit floating point (Requires 'f' suffix)
        float decimalWeight = 75.5f;

        // 6. double: 64-bit floating point (Default for decimals)
        double preciseValue = 3.141592653589793;

        // 7. char: 16-bit Unicode character
        char grade = 'A';

        // 8. boolean: represents true or false
        boolean isJavaFun = true;

        // Outputting values
        System.out.printf("Byte: %d, Short: %d, Int: %d, Long: %d%n", 
                           smallNumber, midRangeNumber, standardInteger, largeNumber);
        System.out.printf("Float: %.2f, Double: %.10f%n", decimalWeight, preciseValue);
        System.out.printf("Char: %c, Boolean: %b%n%n", grade, isJavaFun);
    }

    /**
     * Demonstrates Reference Types, including Strings, Arrays, and Wrapper Classes.
     */
    private static void displayReferenceTypes() {
        System.out.println("--- Reference Data Types ---");

        // String: A sequence of characters (The most common reference type)
        String greeting = "Hello, Java Professional!";

        // Array: A fixed-size collection of the same type
        int[] numberArray = {1, 2, 3, 4, 5};

        // Wrapper Classes: Object versions of primitives (Nullable)
        Integer wrappedInt = Integer.valueOf(100);
        Double wrappedDouble = 99.99; // Autoboxing

        // Object: The root of all Java classes
        Object genericObject = new Object();

        System.out.println("String: " + greeting);
        System.out.println("Array Length: " + numberArray.length);
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Object HashCode: " + genericObject.hashCode());
    }
}