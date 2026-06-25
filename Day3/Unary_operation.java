import java.util.*;

public class Unary_operation {
    public static void main(String args[]) {
        int a = 10;
        int b;

        // 1. Post-Increment (Use value first, then change it)
        b = a++; 
        System.out.println("Post-Increment:");
        System.out.println("Value of a: " + a); // Becomes 11
        System.out.println("Value of b: " + b); // Stays 10 (assigned before a changed)
        System.out.println("---");

        // Resetting values
        a = 10; 
        
        // 2. Pre-Increment (Change value first, then use it)
        b = ++a; 
        System.out.println("Pre-Increment:");
        System.out.println("Value of a: " + a); // Becomes 11
        System.out.println("Value of b: " + b); // Becomes 11
    }
}