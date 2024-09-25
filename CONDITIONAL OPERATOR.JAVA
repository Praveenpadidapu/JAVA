
import java.util.*;
class Conditional_Operator
{
    public static void main(String[] args) 
    {
      int a;
      int b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter value of a :");
      a=sc.nextInt();
      System.out.println("Enter value of b :"); 
      b=sc.nextInt();   
      int c;
      c=(a>b)?a:b;
      System.out.println("This is BIG :"+c);
    }
}
