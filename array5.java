import java.util.*;

class array5
{


      public static void main(String args[])
       {
           Scanner sc = new Scanner(System.in);
           int i;
          int sum=0;
           int[] a=new int[5];
           System.out.println("enter the element in array");
           for(i=0;i<5;i++)
       {
           a[i]=sc.nextInt();
           sum=sum+a[i];
       }
          System.out.println("This is sum of all element in array = " + sum);
}
}
