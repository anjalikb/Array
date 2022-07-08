import java.util.*;
class linear
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
  int[] a={1,2,3,4,5,6};
  int[] b={5,6,6,4,3,2};

 int[] c=new int[a.length];

int i;
{
   for(i=0;i<a.length;i++)
     c[i]=a[i]+b[i];

System.out.print("\na= ");

   for(i=0;i<a.length;i++)
     System.out.print(a[i]);

System.out.print("\nb= ");

   for(i=0;i<b.length;i++)
     System.out.print(b[i]);

System.out.print("\nc= ");

   for(i=0;i<c.length;i++)
     System.out.print(c[i]);

}
}
}