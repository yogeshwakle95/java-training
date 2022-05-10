/*WAP to copy the content of one file to another by using CHAR IO classes.*/
import java.io.*;
public class FileCopy{
    public static void main(String[] args) throws Exception{
        FileReader fin;
        fin=new FileReader("C:\\Users\\ITFACT\\Desktop\\java\\test1.txt");
        FileWriter fout;
        fout=new FileWriter("C:\\Users\\ITFACT\\Desktop\\java\\test2.txt");
        int x; 
        do{
            x=fin.read();
             if (x!=-1){
                 fout.write(x);
             }
    }while(x!=-1);
        System.out.println("Copy finish...");  
        fin.close();  
        fout.close();  
 }  
}   
