//3. Write a program   to find the sum of all elements of the array. 
import java.util.*;
class sumarray{
public static void main(String args[]){
//int[] arr={2,5,7};
int i,element,inputt;
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("input number of element store in array: ");
element=sc.nextInt();
System.out.print("input "+element+" element in array: ");
for (i=0;i<element;i=i+1)
{
System.out.println("element- "+i+" : ");
inputt=sc.nextInt();
}
for (i = 0; i < inputt.length; i++) {  
           sum = sum + inputt[i]; 
}
        System.out.println("Sum of all the elements of an array: " + sum);  
}
}
