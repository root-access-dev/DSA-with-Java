public class D7DSAJavats3 
{
    public static int  getIthBIt(int n , int i)
    {
        int bitmask = 1<<i;
        if ((n & bitmask) == 0) 
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args) 
    {
        System.out.println(getIthBIt(10, 2));
    }
}
