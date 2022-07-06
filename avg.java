import java.util.*;
class avg
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   int sum=0;
   int i;
   int avg=0;
   int[] a=new int[10];
  System.out.println("enter the element");
   for( i=0;i<10;i++)
    a[i]=sc.nextInt();
   
   System.out.println("print the sum and avg");
   for(i=0 ; i<10 ; i++)
  {
      sum=sum+a[i];
      
    }
  avg=sum/10;
     System.out.println("print the sum of no" + sum);
     System.out.println("Print the avg of no" +avg);
}
}