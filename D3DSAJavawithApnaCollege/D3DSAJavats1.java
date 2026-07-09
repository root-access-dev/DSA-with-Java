public class D3DSAJavats1{
    public static void Submsub(int number[] )
    {
        int maxsum = 0;
        for(int i=0;i<number.length;i++)
        {
            int start = i;
        
        for(int j=i;j<number.length;j++)
        {
           int end = j;
           int currentsum = 0;
           System.out.print("[");
           for(int k=start;k<=end;k++)
           {
            System.out.print(number[k] + (k==end?"":","));
            currentsum += number[k];
           }
          System.out.println("] Sum =  " + currentsum);
           if(currentsum>maxsum)
           {
            maxsum = currentsum;
           }
        }
        System.out.println();
        }
        System.out.println("Maximum sum of contiguous subarray is: " + maxsum);
    }
    public static void main(String args[])
    {
        int number[] = {-2,1,-3,4,-1,2,1,-5,4};
        Submsub(number);
    }
}