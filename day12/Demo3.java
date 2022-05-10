import java.util.*;
public class Demo3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter two numbers:");
        try{
            a=sc.nextInt();
            b=sc.nextInt();
            c=a/b;
            System.out.println("Division is: "+c);
        }catch(ArithmeticException|InputMismatchException e){
           // System.out.println(e);
        //if(e instanceof ArithmeticException)
        if(e instanceof ArithmeticException)
        {
            System.out.println("can not divide number by zero");
        }
        else if(e instanceof InputMismatchException)
        {
            System.out.println("plz enter input value");
        }
    }
        System.out.println("End");
    }
    }