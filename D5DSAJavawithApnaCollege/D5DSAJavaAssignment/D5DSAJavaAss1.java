public class D5DSAJavaAss1 
{
    public static int FidnElement(int matrix[][], int key)
    {
        int nu = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j] == key)
                {
                    nu++;
                }
            }
        }
        return nu;
    }

    public static void main(String args[])
    {
        int matrix[][] = {{4, 7, 8}, {8, 8, 7}};
        int key = 7;
        int FindElementrepeat = FidnElement(matrix, key);
        System.out.println(key + " repeats in the given array " + FindElementrepeat + " times.");
    }
}