import java.util.Scanner;

public class D7DSAJavats12 
{
    public static int FastExaponential(int a , int n )
    {
        int ans = 1;
        while (n>0)
        {
            if ((n &1) != 0) 
            {
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
   public static void main(String[] args) 
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number : ");
    int num = sc.nextInt();
    System.out.println("Enter The Power Of a Number : ");
    int pow = sc.nextInt();
    System.out.println(FastExaponential(num,pow));
   }
}
