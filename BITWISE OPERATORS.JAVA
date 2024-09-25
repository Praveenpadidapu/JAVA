import java.util.*;
class Bitwise
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
      System.out.println("Logical AND : "+(a&b));
      System.out.println("Logical OR  : "+(a|b));
      System.out.println("Logical NOT : "+(a^b));
      System.out.println("Complement of A : "+(~a));
      System.out.println("Complement of B : "+(~b));
      System.out.println("Right Shift : "+(a>>b));
      System.out.println("Left Shift : "+(a<<b));


    }

}
