interface A
{
void show();
void display();
}
class B  implements A
{
public void show()
{
System.out.println("hello");
}
public void display()
{
System.out.println("bello");
}
public static void main(String args[])
{
B obj=new B();
obj.show();
obj.display();
}
}
