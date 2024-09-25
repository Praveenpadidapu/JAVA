import java.util.*;
class overloading
{
public static  int add(int a,int b,int c)
{
return a+b;
}
public static int sub(int a,int b)
{
return a-b;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter tyhe value of a");
int a=sc.nextInt();
System.out.println("enter tyhe value of a");
int b=sc.nextInt();
System.out.println("enter tyhe value of c");
int c=sc.nextInt();
System.out.println("add"+add(a,b,c));
System.out.println("sub"+sub(a,b));
}
}
