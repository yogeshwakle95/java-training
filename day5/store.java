//1. Write a program   to store elements in an array and print it. 
import java.util.*;
class store{
public static void main(String args[]){
int i;
Scanner sc=new Scanner(System.in);
int[] inputt=new int[10];
System.out.println("Input 10 elements in the array : ");
for (i=0;i<inputt.length;i=i+1)
{
inputt[i]=sc.nextInt();
System.out.print("element-"+inputt[i]);
}
System.out.print("Elements in array are:");
for (i=0;i<inputt.length;i=i+1)
{
System.out.print(" "+inputt[i]);
}
}
}