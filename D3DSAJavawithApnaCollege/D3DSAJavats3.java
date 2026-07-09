public class D3DSAJavats3 {
    public static void Kadanes(int number[])
    {
        int ms = Integer.MIN_VALUE;
        int cs =0;
        for(int i=0;i<number.length;i++)
        {
            cs = cs + number[i];
            if(cs<0)
            {
                cs=0;
            }
            ms = Math.max(ms,cs);
            System.out.println("Current Sum : " + cs);
        }
        System.out.println("Maximum Sum : " + ms);
    }
    public static void main(String args[])
    {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        Kadanes(number);
    }
}