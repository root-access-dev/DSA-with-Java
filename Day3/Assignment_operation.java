import java.util.*;

public class Assignment_operation 
{
    public static void main(String args[]) 
    {
        int a = 10;
        
        System.out.println("--- ASSIGNMENT OPERATORS ---");

        // 1. Simple Assignment (=)
        int b = a; 
        System.out.println("Value of b (=): " + b); // 10

        // 2. Add and Assign (+=) -> b = b + 5
        b += 5; 
        System.out.println("Value of b after += 5: " + b); // 15

        // 3. Subtract and Assign (-=) -> b = b - 3
        b -= 3; 
        System.out.println("Value of b after -= 3: " + b); // 12

        // 4. Multiply and Assign (*=) -> b = b * 2
        b *= 2; 
        System.out.println("Value of b after *= 2: " + b); // 24

        // 5. Divide and Assign (/=) -> b = b / 4
        b /= 4; 
        System.out.println("Value of b after /= 4: " + b); // 6
    }
}