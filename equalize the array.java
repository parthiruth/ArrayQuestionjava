import java.io.*;
import java.util.*;
public class equalizethearray {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100+1];
        for(int i=0;i<n;i++){
           a[sc.nextInt()]++;}
        int max=0,sum=0;
          for(int i=0;i<=100;i++){
                 if(a[i] > max) {
                      max=a[i]; }
                 sum=a[i]+sum;   }
        System.out.print(Math.abs(sum-max));
    }
}
