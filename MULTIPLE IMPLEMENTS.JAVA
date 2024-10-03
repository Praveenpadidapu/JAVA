interface A
{
void A();
}
interface B
{
void B();
}
interface C
{
void C();
}
interface D
{
void D();
}
class E implements A,B,C,D
{
public void A()
{
System.out.println("implements A");
}
public void B()
{
System.out.println("implements B");
}
public void C()
{
System.out.println("implements C");
}
public void D()
{
System.out.println("implements D");
}
public static void main(String args[])
{
E obj=new E();
obj.A();
obj.B();
obj.C();
obj.D();
}
}




