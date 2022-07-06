import java.util.*;

class array9
{


      public static void main(String args[])
       {
           Scanner x = new Scanner(System.in);
           int i;
           int sum=0;
           int[] a=new int[10];
           System.out.println(" Enter Elements in Array");
          for(i=0; i<10; i++)
             a[i]=x.nextInt();


            for(i=0; i<10; i++)
               {
                 if(a[i]%2==0)
                  sum=sum+a[i];
               }
                  System.out.println("THIS IS SUM OF EVEN NO = " + sum);

        }



 }