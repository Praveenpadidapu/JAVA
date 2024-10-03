import java.util.*;
class Bubblesort
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("enter array sixe");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter array elements");
for (int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
int temp=0;
for ( int i=0;i<arr.length;i++)
{
for (int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("elements after sorting");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]+"");
}
}
}
