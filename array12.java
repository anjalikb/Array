import java.util.*;

class array12
{


      public static void main(String args[])
       {
           Scanner x = new Scanner(System.in);
           int i;
           int[] a=new int[10];
           int size=a.length;
           System.out.println(" Enter Elements in Array");
          for(i=0; i<10; i++)
             a[i]=x.nextInt();
               System.out.println("this is first no in array = "+ a[0]);
               System.out.println("this is second no in array = "+ a[1]);
               System.out.println("this is third no in array = "+ a[2]);
               System.out.println("THIS IS SUM OF FIRST 3 ELEMENT IN ARRAY = " + (a[0] + a[1] + a[2]));
   }
}