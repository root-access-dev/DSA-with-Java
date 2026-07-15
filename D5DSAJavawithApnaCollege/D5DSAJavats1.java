import java.util.*;
public class D5DSAJavats1 {
    //For Search the Give Value in The Given Matrix 
    public boolean Search(int matrix[][] , int key ) 
    {
        for(int i=0;i<matrix.length;i++)
            {
            for(int j=0;j<matrix[0].length;j++)
                {
                if(matrix[i][j] == key)
                    {
                    System.out.println(key + " Is Found At Index (" + i + ","+ j +")\n" );
                    return true;
                    }
                }
            }
        System.out.println(key + " Is Not Found ");
        return false;
    }

    //Find the Min Value in the Given Matrix 
    public int findmax(int matrix[][])
    {
      int max = Integer.MIN_VALUE;

        for(int i=0;i<matrix.length;i++)
            {
            for(int j=0;j<matrix[0].length;j++)
                {
                if (matrix[i][j] >max ) 
                {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    //Find the Max Value in the Given Matrix 
    public int findmin(int matrix[][])
    {
        int min = Integer.MAX_VALUE;

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if (matrix[i][j] < min) 
                {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        System.out.println(" Enter 9 Elements for the 3X3 Matrix  ");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n The Matrix Is : ");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\n Enter the Key to Search : ");
        int key = sc.nextInt();

        D5DSAJavats1 obj = new D5DSAJavats1();


        obj.Search(matrix, key);
        int maxVal = obj.findmax(matrix);
        int minVal = obj.findmin(matrix);

        System.out.println("Maximum Element In Maxtrix Is : " + maxVal);
        System.out.println("Minimum Element In Matrix Is : " + minVal);

        sc.close();
    }
}