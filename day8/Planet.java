/*Create a class that captures planets. Each planet has a name, a distance from the sun, and its 
gravity relative to Earth’s gravity. For distance and gravity, use the type double which captures 
real numbers. Make objects for Earth and your favorite non-earth planet.*/
class Planet{
     String Planetname;
     double distance;
     double gravity;
public Planet(String p,double d,double g){
     Planetname=p;
     distance=d;
     gravity=g;
     }
     void display()
     {
     System.out.println("planet name "+Planetname);
     System.out.println("distance "+distance);
     System.out.println("gravity "+gravity);
     }
     public static void main(String[] args){
     Planet k=new Planet("earth ",4444,56565);
     Planet l=new Planet("dsdsd ",8888,989898);
     k.display();
}
}
           