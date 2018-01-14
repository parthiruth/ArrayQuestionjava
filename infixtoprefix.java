import java.util.*;
public class infixtoprefix{
static int fun(char a){
 switch(a){
    case '+':
    case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      default:
          return -1;
}   }
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
 Stack <Character> stack=new Stack <Character>();
System.out.print("enter the string:");
String s1=sc.next();
String a="";
 for(int i=s1.length()-1;i>=0;i--)
{
     if((s1.charAt(i)>='A'&&s1.charAt(i)<='Z')||(s1.charAt(i)>='a'&&s1.charAt(i)<='z')||(s1.charAt(i)>=0&&s1.charAt(i)<=9))
       {
        a+=s1.charAt(i);                                                                                             
       }
     else if(stack.empty()) 
           {
                        stack.push(s1.charAt(i));
            }

       else {
              while(!stack.empty()&&(fun(s1.charAt(i))<=fun(stack.peek()))){
                      a+=stack.pop();                                      }

                      stack.push(s1.charAt(i));           
            }        
}
    while(!stack.empty())
       {
    a+=stack.pop();      
          }
for(int i=s1.length()-1;i>=0;i--){
System.out.print(a.charAt(i));  }
    
  }
}
   