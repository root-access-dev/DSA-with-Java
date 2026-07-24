public class D7DSAJavats4 
{
    public static int setIthBit(int n , int i)
    {
        int Bitmask = 1<<i;
        return (n | Bitmask);
    }

    public static void main(String[] args) 
    {
        System.out.println(setIthBit(10, 2));
    }
}
