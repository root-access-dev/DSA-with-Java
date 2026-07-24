import java.util.Scanner;

public class D7DSAJavats10 
{
    public static boolean checkthePowerof2(int n)
    {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkthePowerof2(n));
        sc.close();
    }
}
