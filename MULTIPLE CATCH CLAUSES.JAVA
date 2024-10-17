import java.util.*;
class Try3
{
public static void main(String args[])
{
try
{
int arr[]={1,2,3,4,5};
System.out.println(arr[10]);
}
catch(ArithmeticException a)
{
System.out.println(a);
}
catch(ArrayIndexOutOfBoundsException b)
{
System.out.println(b);
}
catch(Exception c)
{
System.out.println(c);
}
}
}
