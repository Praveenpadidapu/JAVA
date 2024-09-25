 -- initialising and retriving using array

import java.util.*;
class Array
{
    public static void main(String args[])
    {
        int a[]={0,1,2,3,4,5,6,7,8,9};
        System.out.println("indes of"+a[1]+" "+a[2]);
    }
}


// changing the value of array elements

import java.util.*;
class Array
{
    public static void main(String args[])
    {
        int a[]={0,1,2,3,4,5,6,7,8,9};
        a[0]=10;
        System.out.println("indes of"+a[0]);
    }
}

// printing array elements usinfor loop 

import java.util.*;
class Array
{
    public static void main(String args[])
    {
        int a[]={0,1,2,3,4,5,6,7,8,9};
        
        for(int i=0;i<11;i++){
        System.out.println(a[i]);
        }
    }
}
 // array elements of matrix

import java.util.*;
class array
{
    public static void main(String args[])
    {
        int a[][]=new int[6][8];
        for(int i=0;i<6;i++)
        {
              for(int j=0;j<8;j++)
            {
                a[i][j]=(int)(Math.random()*10);
                System.out.print(a[i][j]+"");
            }
            System.out.println();
        }
    }
}
