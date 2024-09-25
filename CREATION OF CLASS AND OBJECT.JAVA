import java.util.*;
class Calculator  //creating class
{
    public int add(int a, int b)  //creating object
    {
        int r=a+b;  // declearing operation to do
        return r;  // returing value of operation
    }

}

public class Demo  //main class
{
    public static void main(String args[])
    {
        int n1=50;  // initailizing literals to variables
        int n2=10;
        Calculator calc=new Calculator(); //creating new space to object
        int result=calc.add(n1,n2); // storing operation value in varaible
        System.out.println("the add is"+result);
    }
}
