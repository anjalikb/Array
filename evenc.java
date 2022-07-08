import java.util.*;
class evenc
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int i,j;
   int c=0;
   int sum=0;
 
   int[] a=new int[10];
   System.out.println("eneter the element in array");
   for(i=0;i<10;i++)
    a[i]=sc.nextInt();
   System.out.println("THIS IS EVEN NO IN ARRAY");
    for(i=0;i<10;i++)
    {
       if(a[i]%2==0)
   {
      System.out.println(a[i]);
       sum=sum+a[i];
       c++;
   }
 }
   System.out.println("THE SUM OF THE EVEN NO = " +sum);
   System.out.println("THIS IS COUNT OF EVEN NO = " +c);
}
}