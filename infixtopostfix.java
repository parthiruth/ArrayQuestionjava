import java.util.*;
public class infixtopostfix{
static int fun(char a){
       if(a=='+'||a=='-')
          return 1;
       else if(a=='*'||a=='/')
          return 1;
        else
            return 0;  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
String a="";
Stack <Character> st=new Stack <Character>();
for(int i=0;i<s.length();i++){
   if(s.charAt(i)<='A'&&s.charAt(i)>='Z'||s.charAt(i)<='a'&&s.charAt(i)>='z'||s.charAt(i)<=0&&s.charAt(i)<=9){
       a+=s.charAt(i);                                                                                       }
    else if(st.empty())               {
                 st.push(s.charAt(i)); }
        else {
                 while(!st.empty()&&(fun(st.peek())<=fun(s.charAt(i)))){
                        a+=st.pop();                
                                                                       }
                        st.push(s.charAt(i));
             }
          }
                        while(!st.empty()) {
                         a+=st.pop();      
                                           }
 System.out.println(a);
}
}
                              
                                 
                   
      