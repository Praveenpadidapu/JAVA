import java.util.*;
class  A12
{
void ntr(int a,int b,int c)
{
double d=(b*b)-4*a*c;
if(d==0)
{
System.out.println("roots are real and equal"+(-b/2*a));
}
else if(a==0)
{
System.out.println("not done");
}
else if(d>0)
{
System.out.println("roots are real and distinct"+(-b+(Math.sqrt(d)/(2*a))));
System.out.println("roots are real and distinct"+(-b-(Math.sqrt(d)/(2*a))));
}
else if(d<0)
{
System.out.println("roots are real and imaginary"+(-b+'i'+(Math.sqrt(-d)/(2*a))));
System.out.println("roots are real and imaginary"+(-b+'i'+(Math.sqrt(-d)/(2*a))));
}
}
public static void  main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a,b,c values");
int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();
A12 obj=new A12();
obj.ntr(a,b,c);
}
}
