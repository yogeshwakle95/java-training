//program for finding maximum number(without using ternary operator) 
import java.util.*;
class Maximumnumber{          
public static void main(String args[])
{
int a,b,c,max;
//11String max;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>=b && a>=c)
{
max=a;
}
else if(b>=a && b>=c)
{
max=b;
}
else
{
max=c;
}
System.out.println("the max number is "+max);
}
}
