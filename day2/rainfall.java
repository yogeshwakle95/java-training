/*Exercise 6
Write a program that averages the rain fall for three months, April, May, and June. Declare and 
initialize a variable to the rain fall for each month. Compute the average, and write out the 
results, something like: 
Rainfall for April: 12
Rainfall for May : 14
Rainfall for June: 8
Average rainfall: 11.333333
To get the numerical values to line up use the tabulation character '\t' as part of the character 
string in the output statements. Check that your program prints the correct results. There is a 
beginner's error lurking in this program too! Did you fall victim to it? */

import java.util.*;
class rainfall
{
public static void main(String args[])
{
int april ,may,june;
double avrage;
Scanner sc=new Scanner(System.in);
april=sc.nextInt();
may=sc.nextInt();
june=sc.nextInt();
avrage=(april+may+june)/3;
System.out.println("Rainfall for april is \t "+april );
System.out.println("Rainfall for may is \t "+ may );
System.out.println("Rainfall for june is \t "+ june );
System.out.println("Avarage is  "+avrage );



}
}