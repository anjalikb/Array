import java.util.*;
class array4
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   int[] a=new int[10];
   int size=a.length;
    System.out.println("enter the element of array");
    for(int i=0;i<10;i++)
   a[i]=sc.nextInt();
    System.out.println(" SUM OF FIRST AND SEC ELEMENT IN ARRAY " +(a[0] + a[1]));
}
}