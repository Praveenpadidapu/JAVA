
// binary search

import java.util.*;
class binary
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
int start=arr[0];
int end=arr[n-1];
int mid=((start+end)/2);
System.out.println("enter searching  elements of array ");
int m=sc.nextInt();
for(int i=0;i<arr.length;i++)
{
if(m==arr[i])
{
System.out.println("element if found ");
}
else if(m<mid)
{
end=mid-1;
}
else if(m>mid)
{
start=mid+1;
}
System.out.println("element not found");
}
}
}
