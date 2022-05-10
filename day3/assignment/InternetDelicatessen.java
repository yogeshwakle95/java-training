import java.util.Scanner;
class exercise
{
public static void main(String args[]){
String item;
int expressdel;
Double price;
Double overnight=0.00;
Double regprice=2.00;
Scanner input=new Scanner(System.in);
System.out.println("enter the item:");
item=input.nextLine();
System.out.println("enter the price of item:");
price=input.nextDouble();
System.out.println("Overnight delivery (0==no, 1==yes:");
expressdel=input.nextInt();
if (expressdel>=0 && expressdel<=1);
{
if (expressdel==1)
overnight=3.00;
}
System.out.printf(item);
System.out.printf("        %.2f",price);
if (price<10)
regprice=2.00;
double totalprice=regprice+overnight;
System.out.printf("\n delivery      %.2f",totalprice);
double total=totalprice+price;
System.out.printf("\ntotal     %.2f",total);
}
}




