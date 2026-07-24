import java.util.Scanner;

public class D7DSAJavaAss2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 ");
        int nw1 = sc.nextInt();
        System.out.print("Enter Number 2 ");
        int nw2 = sc.nextInt();

         System.out.println("Before Swapping the Number 1  "+nw1 + ", " +" Number 2 "+nw2);
        // Swap 
        nw1 = nw1 ^ nw2;
        nw2 = nw2 ^ nw1;
        nw1 = nw1 ^ nw2;

        System.out.println("After Swapping the Number 1  "+nw1+","+" Number 2 "+nw2);
        
}
}
