/*Create classes that capture bank customers and bank accounts. A customer has a first and last 
name. An account has a customer and a balance. Make objects for two accounts held by the 
same customer.*/
class customer{
private String fname;
private String lname;
void setfname(String fname){
this.fname=fname;
}
String getfname(){
return this.fname;
}
void setLname(String lname){
this.lname=lname;
}
String getlname(){
return lname;
}
}
class Account{
int balance;
customer cust;
void showAccount(){
System.out.println("fname:"+cust.getfname());
System.out.println("lname:"+cust.getlname());
System.out.println("Balance:"+balance);
}
Account(customer c,int balance){
this.cust=c;
this.balance=balance;
}
}
public class DemoAssign{
public static void main(String[] args){
customer ob1=new customer();
ob1.setfname("abc");
ob1.setLname("xyz");
int x=1000;
Account acc1=new Account(ob1,x);
Account acc2=new Account(ob1,2000);
}
}