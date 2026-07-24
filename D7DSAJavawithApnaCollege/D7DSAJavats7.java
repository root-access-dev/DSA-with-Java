public class D7DSAJavats7 
{
    public static int setIthBit(int n , int i)
    {
        int BitMask = 1<<i;
        return n | BitMask;
    }
    public static int clearIthBit(int n, int i)
    {
        int Bitmask = ~(1<<i);
        return n & Bitmask;
    }
    public static int updateIthBit(int n , int i , int newBit)
    {
        if (newBit == 0) 
        {
            return clearIthBit(n, i);
        }
        else
        {
            return setIthBit(n, i);
        }
    }
    
    public static void main(String args[])
    {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
 