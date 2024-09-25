import java.util.*;
class A1
{
public void A(){
  System.out.println("Parent class");
 }
 }
 class B1 extends A1
 {
 public void A12(){
  System.out.println("Child class");
  }
  public static void main(String []args){
  B1 Obj =new B1();
  Obj.A();
  Obj.A12();
  }
}
