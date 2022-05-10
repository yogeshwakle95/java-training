import java.io.*;
public class Demo1 {
    public static void main(String[] args)throws Exception {
       
        FileInputStream fin;
        fin=new FileInputStream("C:\\Users\\ITFACT\\Desktop\\java\\test1.txt");
       
        BufferedInputStream bin;
        bin=new BufferedInputStream(fin);

        FileOutputStream fFileOutputStreamout;
        fout=new FileOutputStream("\\Users\\ITFACT\\Desktop\\java\\test2.txt");
        BufferedOutputStream bout;
        bout=new BufferedOutputStream(fout);        
         int x;
        System.intout.println(fin.available());       
        do{
            x=bin.read();
            if(x!=-1){
                bout.write(x);
            }
        }while(x!=-1);
        bin.close();
        bout.close();
        System.out.println("File Copied");
        
    }

}
