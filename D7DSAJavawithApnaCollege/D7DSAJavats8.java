public class D7DSAJavats8 
{
    public static int clearlastIthBit(int n , int i)
    {
        int Bitmask = (~0)<<i;
        return n & Bitmask;
    }

    public static void main(String[] args)
    {
       System.out.println(clearlastIthBit(15, 2)); 
    }
}
