public class D5DSAJavats5 {
    public static int DiagonalSum(int matrix[][])
    {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            // Primary Diagonal (PD): i == j
            sum += matrix[i][i];
        
            // Secondary Diagonal (SD): i + j == n - 1 -> j = n - 1 - i
            // The condition (i != matrix.length-1-i) avoids double-counting the center element in odd-sized matrices
            if (i != matrix.length - 1 - i) 
            {
                sum += matrix[i][matrix.length - 1 - i]; // Fixed: added "- i"      
            }
        }
        return sum;
    }
    
    public static void main(String args[])
    {
        int matrix[][] = {{1 ,2 ,3 ,4 },
                          {5 ,6 ,7 ,8 },
                          {9 ,10 ,11 ,12 },
                          {13 ,14 ,15 ,16}};
                          
        int sumM = DiagonalSum(matrix);
        System.out.println("Diagonal Sum : " + sumM); // Expected Output: 68
    }
}