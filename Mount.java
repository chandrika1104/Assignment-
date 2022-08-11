import java.util.*;
class Mount
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
             if(i+j>=n-1 + n/2||i-j>=(n-1)/2)
             //if(j==n-1&&i>=(n-1)/2||i-j>=(n-1)/2)   
             //if(i==(n-1)/2||j==0||j==(n-1)||i+j>=(n-1)||i>=j)
             //if(i==j&&j<=(n-1)||i+j>=(n-1))
             System.out.print("*");
             else
             System.out.print(" ");
          }
          System.out.println();
      }
   }
}