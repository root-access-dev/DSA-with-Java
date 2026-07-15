public class D5DSAJavaAss2 {
    public static int PrintSumofArray(int matrix[][])
    {
        int sum =0;
        for(int i=1;i<2;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    
    public static void main(String args[])
    {
        int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int ArraySum = PrintSumofArray(matrix);
        System.out.println("The Sum Of The Second Row Of The Given Array : " + ArraySum);
    }
}
