/*Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on
the outside and the longer string on the inside. The strings will not be the same length, but they
may be empty (length 0). If input is "hi" and "hello", then output will be "hihellohi".*/
public class Example6{
    public static void main(String[] args){
        String str1="hi";
        String str2="hello";
        int str3=str1.length();
        int str4=str2.length();
        if(str3>str4){
            System.out.println(str2+str1+str2);
        }
        else{
            System.out.println(str1+str2+str1);
       }
       }
       }