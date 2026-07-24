public class D7DSAJavats6 
{
    public static int clearIthBit(int n , int i)
    {
        int Bitmask = ~(1<<i);
        return (n & Bitmask);
    }
    public static int updateIthBit(int n , int i , int newBit)
    {
        n = clearIthBit(n, i);
        int Bitmask = newBit<<i;
        return n | Bitmask;
    }

    public static void main(String[] args) 
    {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
