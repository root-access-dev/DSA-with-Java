import java.util.Scanner;

public class D7DSAJavats2Pq1 
{
    public void OddEven(int n)
    {
        int Bitmask = 1;
     if ((n & Bitmask) == 0) 
     {
        System.out.println("Even Number");
     }
     else
     {
        System.out.println("Odd Number");
     }
    }
public static void main(String args[]) 
{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The Number : ");
      int ns = sc.nextInt();
      D7DSAJavats2Pq1 obj1 = new D7DSAJavats2Pq1();
      obj1.OddEven(ns);
      sc.close();
}
}
