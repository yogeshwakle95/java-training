import java.util.*;
class palindrome1{
    public static void main(String[] args){
        int a,b,sum=0,temp;
        //Scanner sc=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:");
        a=sc.nextInt();
        temp=a;
        while(a>0){
            b=a%10;
            sum=(sum*10)+b;
            a/=10;

        }
        if(temp==sum)
            System.out.println("number is palindrome");
        else
        System.out.println("number is not palindrome");
    }
}