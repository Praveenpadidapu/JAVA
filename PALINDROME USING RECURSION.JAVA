
import java.util.*;
class Recursionpalindrome{
    static int rev(int n,int temp)
    {
     if (n == 0)
        return temp;
     temp = (temp*10)+(n%10);
     return rev(n/10,temp);
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     System.out.print("enter the number:");
     int n = sc.nextInt();
     int temp = rev(n,0);
     if(n==temp)
     {
        System.out.println(n+" is a palindrome");

     }  
     else
     {
        System.out.println(n+" is not a palindrome");
     }
    }
}
