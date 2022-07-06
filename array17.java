import java.util.*;
class array17
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   
   
   int count=0;
   int i;
   int[] a=new int[10];
  System.out.println("enter the element");
   for( i=0;i<10;i++)
    a[i]=sc.nextInt();
   
   System.out.println("print the count of even no");
   for(i=0 ; i<10 ; i++)
  { 
      if(a[i]%2!=0)
   {
      System.out.println(a[i]+ " ");
      count++;
      
    }
  }
     System.out.println("print the count of odd no = " + count);
     
}
}