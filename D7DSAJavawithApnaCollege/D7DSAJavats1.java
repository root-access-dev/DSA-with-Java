import java.util.Scanner;

public class D7DSAJavats1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = sc.nextInt();

        System.out.println("\n=== Java Bitwise Operators Demo ===");
        
        // 1. Bitwise AND (&)
        // Returns 1 if both bits are 1, else 0.
        System.out.println("Binary AND (a & b)             : " + (a & b));

        // 2. Bitwise OR (|)
        // Returns 1 if at least one bit is 1, else 0.
        System.out.println("Binary OR (a | b)              : " + (a | b));

        // 3. Bitwise XOR (^)
        // Returns 1 if bits are different, else 0.
        System.out.println("Binary XOR (a ^ b)             : " + (a ^ b));

        // 4. Bitwise Bitwise Complement / One's Complement (~)
        // Inverts all bits (0 -> 1, 1 -> 0). Represented using 2's complement.
        System.out.println("Bitwise NOT (~a)               : " + (~a));

        // 5. Binary Left Shift (<<)
        // Shifts bits left by 'b' positions. Equivalent to: a * (2^b)
        System.out.println("Left Shift (a << b)            : " + (a << b));

        // 6. Binary Right Shift (>>) [Signed]
        // Shifts bits right by 'b' positions. Preserves the sign bit (MSB). Equivalent to: floor(a / 2^b)
        System.out.println("Signed Right Shift (a >> b)    : " + (a >> b));

        // 7. Unsigned Right Shift (>>>)
        // Shifts bits right by 'b' positions, filling left-most bits with 0s regardless of sign.
        System.out.println("Unsigned Right Shift (a >>> b) : " + (a >>> b));

        sc.close();
    }
}