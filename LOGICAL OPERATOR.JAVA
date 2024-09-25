import java.util.*;
class Logical
{
    public static void main(String[] args) 
    {
      int a;
      int b;
      int c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter value of a :");
      a=sc.nextInt();
      System.out.println("Enter value of b :"); 
      b=sc.nextInt();  
      System.out.println("Enter value of c :");
      c=sc.nextInt();  
      System.out.println("Logical AND : "+((a>b)&&(a==b)));
      System.out.println("Logical OR : "+((a<b)||(a==c)));
      System.out.println("Logical NOT : "+(!(a>=c)));  
      
    }

}
