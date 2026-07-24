import java.util.Scanner;

public class D7DSAJavats11 
{
    public static int countSetOfBit(int n)
    {
        int count = 0;
        while (n > 0) 
        {
            if ((n & 1) != 0) 
            {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(countSetOfBit(n));
      sc.close();
    }
}
