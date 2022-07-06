import java.util.*;

class array3
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
               System.out.println("first element of array is = "+ a[0]);
               System.out.println("last element of array is = "+ (a[size-1]));
   }
}