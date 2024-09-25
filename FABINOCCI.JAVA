import java.util.*;
class A
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n upto which  we have to print febinocci series");
        int n=sc.nextInt();
        int n3=0,n1=0,n2=1;
        for(int i=0;i<n;++i){
            System.out.printf(n3+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}
