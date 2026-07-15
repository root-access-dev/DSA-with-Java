public class D5DSAJavats2 {
    public static void main(String[] args) 
    {
        // Initialize the 4x4 2D array
        int[][] grid = new int[4][4];
        
        // Populate the array with numbers 1 to 16
        int value = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) 
            {
                grid[i][j] = value++;
            }
        }
        
        // Print the grid in a clean, formatted structure
        for (int i = 0; i < 4; i++) 
            {
            for (int j = 0; j < 4; j++) 
            {
                // Using printf with "%-4d" to ensure aligned columns
                System.out.printf("%-4d", grid[i][j]);
            }
            System.out.println(); // Move to the next row
        }
    }
}