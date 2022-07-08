import java.util.*;
class countzero
{
public static void main(String args[])
{
  int[] a=new int[10];
    int i , k=0;
     i=1;
Scanner sc=new Scanner(System.in);

   while (i!=0)
{
   i=sc.nextInt();
   a[k]=i;
   k++;
}

 for(i=0 ; i<k-1 ; i++)
  System.out.println(a[i]+ " ");
}
}