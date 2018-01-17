import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sockmerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
         int[] a=new int [100000];
        int b=0,result=0;
        for(int i=0;i<n;i++)
             {
              b=c[i];
              a[b]++;
              }
        for(int i=0;i< 100000;i++)
            {
              result=result+a[i]/2;
            }
        System.out.print(result);
          
    }
}
