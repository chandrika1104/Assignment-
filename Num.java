import java.util.*;
class Num
{
   public static void main(String args[])
   {
      System.out.println("Loop Started Enter a number");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      { 
          for(int j=0;j<n;j++)
          {
             System.out.print(i);
          }
          System.out.println();
      }
   }
}