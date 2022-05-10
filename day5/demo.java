import java.util.*;
class demo{
public static void main(String args[]){
int i;
Scanner sc=new Scanner(System.in);
int[] arrr=new int[10];
System.out.println("enter array");
for (i=0;i<arrr.length;i=i+1)
{
arrr[i]=sc.nextInt();
}
System.out.println("your array");
for (i=0;i<arrr.length;i=i+1)
{
System.out.print(" "+arrr[i]);
}
}
}
