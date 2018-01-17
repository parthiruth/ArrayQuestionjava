import java.util.*;
import java.io.*;
class maxonebinarynum
 {
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
    String s;
    System.out.println("enter the no:");
     int a,count=0,max=0,one=0;
         a=sc.nextInt();
      s=Integer.toBinaryString(a);
      for(int i=0;i<s.length();i++)
         {
            if(s.charAt(i)=='1')
             {
              count++; 
              max=count;
              }
             if(one<max)
               {
                  one=max;
               }
            }
 System.out.print(one);
}
}    
               