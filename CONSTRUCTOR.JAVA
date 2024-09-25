//constructor with default and perametarized constructors type 


import java.util.*;
class Collect
{
    int roll;
    String name;
    float sal;
    char sec;

Collect()
{
    roll=123;
    name="praveen";
    sal=780000.2f;
    sec='c';
}
Collect(int n,String str,float f,char c)
{
    roll=n;
    name=str;
    sal=f;
    sec=c;
}
public static void main(String args[])
{
Collect col1=new Collect();
Collect col=new Collect(987,"kumar",980000.45f,
'c');
System.out.println("default type collect");
System.out.println("default"+col1.roll);
System.out.println("default"+col1.name);
System.out.println("default"+col1.sal);
System.out.println("default"+col1.sec);
System.out.println("perameterized type collect");
System.out.println("perametarized"+col.roll);
System.out.println("perametarized"+col.name);
System.out.println("perametarized"+col.sal);
System.out.println("perametarized"+col.sec);
}
}
