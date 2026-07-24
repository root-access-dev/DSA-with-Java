import java.util.Scanner;

public class D7DSAJavaAss1 {
    
    public static long calculateXToTheX(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative.");
        }
        if (x == 0) {
            return 1; // 0^0 is treated as 1 in discrete math/DSA conventions
        }

        long ans = 1;
        long base = x;
        int exp = x;

        while (exp > 0) {
            // Check if the Least Significant Bit (LSB) is 1 (odd power)
            if ((exp & 1) == 1) {
                ans = ans * base;
            }
            base = base * base; // Square the base for the next bit position
            exp = exp >> 1;     // Bit-shift right (divide exponent by 2)
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            System.out.println(x + "^" + x + " = " + calculateXToTheX(x));
        }
        
        sc.close();
    }
}