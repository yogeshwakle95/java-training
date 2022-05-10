/*Given a string, return a version without the first and last char, so "Wipro" yields "ipr". The string
length will be at least 2.*/
public class Example5{
     public static void main(String[] args){
         String str1="wipro";
         str1=str1.substring(1,str1.length()-1);
         System.out.println(str1);
         }
         }