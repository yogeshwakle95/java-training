import java.util.*;
class number{
public static void main(String args[])
{
int a;
Scanner input=new Scanner(System.in);
System.out.println("enter the number");
a=input.nextInt();
if (a==0)
{
System.out.println("number is zero");
}
else if (a>=1)
System.out.println("number is positive");
else
{
System.out.println("number is negative");
}
}
}