import java.util.Scanner;

public class D6DSAJavaAss1 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String str = sc.next();

int coutn = 0;


    for(int i=0;i<str.length();i++)
    {
    char ch = str.charAt(i);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
    {
         coutn++;
    }
    }
    System.out.println("Count of Vowels is : " + coutn );
    }
}
