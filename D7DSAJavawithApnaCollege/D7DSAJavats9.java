public class D7DSAJavats9 
{
    public static int clearrangeOfBits(int n , int i , int j)
    {
        int a = (~0) << (j+1);
        int b = (1 << i) - 1;
        int Bitmask = a|b;
        return n & Bitmask;
    }
    public static void main(String[] args) 
    {
        System.out.println(clearrangeOfBits(10, 2, 4));
    }
}
 