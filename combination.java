import java.util.*;

public class Combination{
int result = 1;

 combination(int a,int b){
 
 if(b==0&&a>=0)
     System.out.println(result);
  

  else if(a==0&&b>=1)
     {
       result = 0;
       System.out.println(result);
      }

  else
   {
    for(int i=1;i<=b;i++)
     {
        result*= a;
     }
    //return result;
  }

System.out.println( b +"questions:"+"-"+result+":combination");

}


  
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("enter the how many possible:");
int possible = sc.nextInt();

System.out.println("enter the how many Question:");
int question = sc.nextInt();

combination cn = new combination(possible,question);



}
}