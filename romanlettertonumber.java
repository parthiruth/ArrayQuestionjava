import java.util.*;
public class romanlettertonumber   {
static int roma(char i){
switch(i)  {
     case 'I':
           return 1;
        
     case 'V':
           return 5;
          
     case 'X':
           return 10;
        
     case 'L':
           return 50;
        
     case 'C':
           return 100;
        
     case 'D':
           return 500;
        
     case 'M':
           return 1000;
   default:     
return 0;
}   }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int sum=0;
for(int i=0;i<s.length();i++){
if(i+1<s.length()){
  if(roma(s.charAt(i))<roma(s.charAt(i+1)))
      {
       sum+=roma(s.charAt(i+1))-roma(s.charAt(i)); 
                    i=i+1;
        //System.out.print(sum+" ");
       }

       else {
        sum+=roma(s.charAt(i));  
         // System.out.print(sum+" ");
          }
   }
else{
      sum+=roma(s.charAt(i));
     // System.out.print(sum+" ");

    }
}
System.out.print(sum+" ");
}
}