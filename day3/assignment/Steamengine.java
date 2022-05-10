import java.util.*;
class Steamengine{
public static void main(String args[])
{
int tair;
int tsteam;
int efficiency;
Scanner input=new Scanner(System.in);
System.out.println("enter the air tempreture:");
tair=input.nextInt();
System.out.println("enter the steam tepreture:");
tsteam=input.nextInt();
if (tsteam<373)
{
System.out.println(0);
}
else
{
System.out.println((1-tair)/tsteam);
}
}
}