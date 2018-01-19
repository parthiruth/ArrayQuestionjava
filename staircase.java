import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         int k=1;
        for(int i=1;i<=n;i++)
             {
              for(int j=n-1;j>=i;j--)
                  {
                  System.out.print(" ");
              }
              
                for(int j=1;j<=k;j++)
                    {
                   System.out.print("#");
                   }
            
            k++;
              System.out.print("\n");
        }
      
        }
    
}
