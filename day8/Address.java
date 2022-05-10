class Address{
   int housenum;
   String areaname;
   String city;
   void setHousenum(int housenum){
      this.housenum=housenum;
   }
   int getHousenum()
   {
      return housenum;
   }
   void setAreaname(String areaname){
      this.areaname=areaname;
   }
   String getAreaname(String areaname){
      return areaname;
   }
   void setCity(String city){
      this.city=city;
   }
   String getCity(String City){
      return city;
   }
  }
  
class Student{
   int id;
   String name;
   Address adr;
   public void setId(int id){
      this.id=id;
   }
   public void setAdr(Address adr){
      this.adr=adr;
   }
   public void setName(String name){
   this.name=name;
   }
   public String getName(){
   return name;
   }
   public int getId(){
      return id;
   }
   public Address getAdr(){
      return adr;
   }
}
class Demo{
public static void main(String[] args){
Address ad=new Address();
ad.setHousenum(1);
ad.setAreaname("abc");
ad.setCity("aurangabad");

Student st=new Student();
int x=101;
st.setId(x);
st.setAdr(ad);
st.setName("xyz");

int id1;
//Address ad1;
id1=st.getId();
String n;
n=st.getName();
Address ad1;
ad1=st.getAdr();

int hn;
hn=ad1.getHousenum();
String area;
area=ad1.getAreaname();
String city=ad1.getCity();
}
}