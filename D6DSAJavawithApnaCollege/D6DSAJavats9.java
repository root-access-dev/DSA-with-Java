public class D6DSAJavats9 
{
    public static String LargestString(String Fruit[])
    {
        String largest = Fruit[0];
        for(int i=0;i<Fruit.length;i++)
        {
            if (largest.compareTo(Fruit[i])<0) 
            {
                largest = Fruit[i];
            }
        }
        return largest;
    }

    

    public static void main(String args[])
    {
        String str[] = {"Apple","Mango","Banana"};
       System.out.println(LargestString(str));
    }
}