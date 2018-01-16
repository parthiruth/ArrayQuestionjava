import java.util.*;
import java.io.*;
public class threefourcombination
 {
 public static void main(String arg[])
 {
    Scanner sc= new Scanner(System.in);
     int a=sc.nextInt();
      Queue<Integer> q=new LinkedList<>();
       int t=3;
       int f=4;
        int flag=0;
           q.add(0);
           q.add(-100);
             while(a>0)
                {
                  while(q.peek()>=0 && a>0)
                   {
                     int x1=q.peek()*10+t;
                     int x2=q.poll()*10+f;
                     if(a>1)
                      {
                        System.out.println(x1);
                        System.out.println(x2);
                        a-=2;
                       }
                    else if(a>=1)
                       {
                          System.out.println(x1);
                         a-=1;
                        }
                          q.add(x1);
                          q.add(x2);
                              if(a<0)
                                {
                                   flag=1;
                                   break;
                                 }
  

                 }
       q.remove(-100);
        q.add(-100);
}
}
} 