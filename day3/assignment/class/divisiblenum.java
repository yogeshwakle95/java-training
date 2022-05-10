import java.util.*;
class number{
public static void main(String args[])
{
int a;
Scanner input=new Scanner(System.in);
System.out.println("enter the number");
a=input.nextInt();
if (a%5==0 && a%11==0)
{
System.out.println("number is divisible");
}
else
{
System.out.println("number is not divisible");
}
}
}