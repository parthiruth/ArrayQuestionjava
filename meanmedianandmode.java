import java.io.*;
import java.util.*;

public class meanmedianandmode {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solut
        ion. */
          Scanner sc=new Scanner(System.in);
          int n= sc.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++)
              a[i]=sc.nextInt();
        Arrays.sort(a);
        int sum=0;
          for(int i=0;i<n;i++)
              {
                sum=a[i]+sum;
               
           }
        int c[]= new int[1000000];
        int p=0;
        for(int i=0;i<n;i++)
            {
               p=a[i];
                c[p]++;
            }
        int max=0,result=-1;
        for(int i=0;i<1000000;i++)
            {
              if(max<c[i])
                  {
                  max=c[i];
            
                  result=i;  
              }
        }
        
            
        System.out.println((float)sum/n);
        System.out.println((float)(a[n/2-1]+a[n/2])/2);
        System.out.println(result);
    }
}