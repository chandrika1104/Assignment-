import java.util.*;
class K
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
             if(j==0||i==0||i==(n-1)||i-j>=(n-1)/2||i+j<=(n-1)/2)
             System.out.print("*");
             else
             System.out.print(" ");
          }
          System.out.println();
      }
   }
}