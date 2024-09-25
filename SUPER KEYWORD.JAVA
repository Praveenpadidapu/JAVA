mport java.util.*;
class A
{
public void A1()
{
System.out.println("parent");
}
}
class C extends A
{
public void A1()
{

System.out.println("child");
}
void display()
{
super.A1();
A1();
}
public static void main(String args[])
{
C obj=new C();
obj.display();

}
}
