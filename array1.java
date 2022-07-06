import java.util.*;

class array1
{


      public static void main(String args[])
       {
           Scanner sc = new Scanner(System.in);
           int i;
           System.out.println("enter the number");
           int n=sc.nextInt();
           int[] a=new int[10];
           System.out.println(" Enter Elements in Array");
          for(i=0; i<n; i++)
             a[i]=sc.nextInt();


            System.out.println(" print the array");  
            for(i=0; i<n; i++)
               {
              
               System.out.println(a[i]);
               }

        }



 }