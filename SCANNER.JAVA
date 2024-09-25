import java.util.*;
class Calculator
{
    public int add(int a, int b)
    {
        int r=a+b;
        return r;
    }
    public int multiply(int a,int b)
    {
        int f=a*b;
        return f;
    }


}

public class Demo
{
    public static void main(String args[])
    {
        int n1;
        int n2;
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n1,n2,a,b values");
        n1=sc.nextInt();
        n2=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        Calculator calc=new Calculator();
        int result=calc.add(n1,n2);
        System.out.println("the add is"+result);
        float result1=calc.multiply(a,b);
        System.out.println("the product is"+result1);
    }
}
