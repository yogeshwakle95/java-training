//Write a program   to read n number of values in an array and display it in reverse order. 
import java.util.*;
class reverse{
public static void main(String args[]){
//int[] arr={2,5,7};
int i,element,inputt;
Scanner sc=new Scanner(System.in);
System.out.print("input number of element store in array: ");
element=sc.nextInt();
System.out.print("input number of element store in array: "+element);
for (i=0;i<element;i=i+1)
{
System.out.println("element- "+i+" : ");
inputt=sc.nextInt();
}
for (i=0;i<element;i=i+1)
{
System.out.println("the value store in array:"+inputt[i]);
}
System.out.println("Array in reverse order: ");  
for(i = inputt.length-1; i >= 0; i--) 
{  
System.out.print(inputt[i] + " ");  
}
}
}
