import java.util.*;
class Try
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of aray");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter elements of array");
for (int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("array elements");
for (int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}

