import java.util.*;
class number{
public static void main(String args[])
{
int a;
Scanner input=new Scanner(System.in);
System.out.println("enter the number");
a=input.nextInt();
if (a%4==0)
{
System.out.println("year is leap");
}
else
{
System.out.println("year is not leap");
}
}
}