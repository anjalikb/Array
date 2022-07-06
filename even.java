import java.util.*;

class even
{


      public static void main(String args[])
       {
           Scanner x = new Scanner(System.in);
           int i;
           int[] a=new int[10];
           System.out.println(" Enter Elements in Array");
          for(i=0; i<10; i++)
             a[i]=x.nextInt();


            System.out.println(" this is even Elements in Array");  
            for(i=0; i<10; i++)
               {
                 if(a[i]%2==0)
               System.out.println(a[i]);
               }

        }



 }