import java.util.*;
class Assignment_Operator
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
      System.out.println("Addition: "+(a+=b));
      System.out.println("Subtraction: "+(a-=b));
      System.out.println("Multiplication: "+(a*=b));
      System.out.println("Division: "+(a/=b));
      System.out.println("Modulo Division: "+(a%=b));
    }

}
