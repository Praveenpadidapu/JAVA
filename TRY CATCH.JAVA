
// simple try catch exception
import java.util.*;
class Try
{
public static void main(String args[])
{
try
{
int a=10/0;
System.out.println(a);
}
catch(Exception  b)
{
System.out.println("arthematic  exception");
}
}
}

//array out of index exception

import java.util.*;
class Try2
{
public static void main(String args[])
{
try
{
int arr[]={1,2,3,4,5};
System.out.println(arr[2]);
}
catch(Exception  a)
{
System.out.println(a);
}
}
}
