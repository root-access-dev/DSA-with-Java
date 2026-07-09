public class D3DSAJavats4 {
    public static void Kadanes(int number[]) {
        int ms = Integer.MIN_VALUE; // Maximum Sum
        int cs = 0;                 // Current Sum

        System.out.println("Element\t| Current Sum\t| Maximum Sum");
        System.out.println("-------------------------------------");

        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            
            // If current sum becomes negative, reset it to 0
            if (cs < 0) {
                cs = 0;
            }
            
            // Update maximum sum if current sum is larger
            if (cs > ms) {
                ms = cs;
            }

            // Print the values at the current step
            System.out.println(number[i] + "\t| " + cs + "\t\t| " + ms);
        }
        
        System.out.println("-------------------------------------");
        System.out.println("Final Maximum Sum: " + ms);
    }

    public static void main(String args[]) {
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadanes(number);
    }
}