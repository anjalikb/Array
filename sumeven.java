import java.util.*;
class sumeven
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   int sumeven=0;
   int i;
   int[] a=new int[10];
  System.out.println("enter the element");
   for( i=0;i<10;i++)
    a[i]=sc.nextInt();
   
   System.out.println("print the sum and avg");
   for(i=0 ; i<10 ; i++)
  { 
      if(a[i]%2==0)
      sumeven=sumeven+a[i];
      
    }
     System.out.println("print the sum of no" + sumeven);
     
}
}