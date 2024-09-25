//
import java.util.*;
class chrs{
  public static void main(String []args)
  {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the charector:");
    ch=sc.next().charAt(0);
    switch(ch){
   case 'a':
   case 'A':
   case 'e':
   case 'E':
   case 'i':
   case 'I':
   case 'o':
   case 'O':
   case 'u':
   case 'U':
   System.out.println("vowel");
   break;
   default:System.out.println("consonant");
   }
   }
   }
   
