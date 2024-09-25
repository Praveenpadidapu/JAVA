class A
{
public void A1()
{
System.out.println("main parent class");
}
}
class B extends A
{
public void B1()
{
System.out.println("secound parent class");
}
}
class C extends B
{
public void C1()
{
System.out.println("child class");
}
public static void main(String args[])
{
C obj=new C();
obj.A1();
obj.B1();
obj.C1();
}
}
