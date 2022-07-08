import java.util.*;
class oddc
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int c=0;
  int sum=0;
  int[] a=new int[10];
   System.out.println("enter element in array");
   for(int i=0;i<10;i++)
   a[i]=sc.nextInt();
   System.out.println("print odd element in array");
    for(int i=0;i<10;i++)
    {

        if(a[i]%2!=0)
     { 
       System.out.println(a[i]);
         sum=sum+a[i];
         c++;
     }
   }
      System.out.println("print the sum of odd no = " +sum);
     System.out.println("print the count of odd no = " +c);
}
}
