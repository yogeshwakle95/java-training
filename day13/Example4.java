/*Given a string of even length, return the first half. So the string "CatDog" yields "Cat". If the
string length is odd number then return null.*/
public class Example4{
     public static void main(String[] args){
         String str1="CatDog";
         int n=str1.length();
         String output;
         if(n%2==0){
            output=str1.substring(0,n/2);
         }
         else{
             output=null;
         }
         System.out.println(output);
         }
         }        

