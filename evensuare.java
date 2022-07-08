import java.util.*;
class evensuare
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int[] a=new int[10];
  int sq=0;
   System.out.println("enter element in array");
   for(int i=0;i<10;i++)
   a[i]=sc.nextInt();
   System.out.println("print even element in array");
    for(int i=0;i<10;i++)
    {

        if(a[i]%2==0)
     { 
       System.out.println(a[i]);
          sq=a[i]*a[i];
        System.out.println("this is square of even positions = " +sq);
         
      }
        
   }

}
}