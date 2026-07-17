public class D6DSAJavats8 
{
    public static String SubStringEx(String str , int si , int ei)
    {
        String substr = "";
        for(int i=si;i<ei;i++)
        {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[])
    {
     //Substring 
     String str = "HelloWorld";
     System.out.println(str.substring(0,5));
     System.out.println(SubStringEx(str, 0, 5));
    }
}
