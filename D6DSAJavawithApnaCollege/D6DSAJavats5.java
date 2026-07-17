public class D6DSAJavats5 
{
    public static boolean StringPalindromeEx(String str)
    {
        int n = str.length();
      for(int i=0;i<str.length()/2;i++)
      {
        if (str.charAt(i) == str.charAt(n-1-i)) 
        {
            System.out.println(str + " String is Palindrome ");
            return true;
        }
      }
      System.out.println(str + " String is Not a Palindrome ");
      return false;
    }

    
    public static void main(String args[])
    {
        String str = "Abhay";
        StringPalindromeEx(str);
    }
}

