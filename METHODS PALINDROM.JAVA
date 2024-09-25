import java.util.*;
class pali1
{
   public static int pali(int n,int k){
   if(n==0){
  return k;
  }
   else{
     k=k*10+n%10;
     return pali(n/10,k);
     }
    }
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value to check for palindrome"); 
    int a=sc.nextInt();
    int a1=pali(a,0);
    if(a1==a){
	System.out.println(a+" is a palindrome");
	}
    else{
	System.out.println(a+" is not a palindrome");
	}
   }
}
