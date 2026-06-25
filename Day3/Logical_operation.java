import java.util.*;
public class Logical_operation
{
  public static void main(String args[])
  {
    boolean condition1 = (3 > 2);
    boolean condition2 = (1 != 1);
    boolean condition3 = (5 < 10);

    System.out.println(".........LOGICAL OPERATION...........");
  //Logical AND(&&)
  System.out.println("condition1 && condition2 "+ (condition1 && condition2));
  System.out.println("condition1 && condition3 "+ (condition1 && condition3));
  //Logical OR(||)
  System.out.println("condition1 || condition2 "+ (condition1 || condition2));
  System.out.println("condition1 || condition3 "+ (condition1 || condition3));
  //Logical NOT(!)
  System.out.println("NOT condition1 "+ (!condition1));
  System.out.println("NOT condition2 "+ (!condition2));
  }
}