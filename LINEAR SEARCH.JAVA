import java.util.*;

class linearsearch
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("enter array sixe");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter array elements");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("enter searching number");
int z=sc.nextInt();
for(int i=0;i<=n;i++)
{
if(z==i)
{
System.out.println("element is found ");
}

}




}
}

