/*Given a string, return a new string made of n copies of the first 2 chars of the original string
where n is the length of the string. The string may be any length. If there are fewer than 2 chars,
use whatever is there. If input is "Wipro" then output should be "WiWiWiWiWi".*/
public class Example3{
     public static void main(String[] args){
       String str1="wipro";
       int n;
       String repeat="";
       String output="";
       n=str1.length();
       if(n<2){
       repeat=str1;
       }
       else{
       repeat=str1.substring(0,2);
       }
       for(int i=0;i<n;i++){
           output+=repeat;
       }
       System.out.println(output);
       }
       }    
       