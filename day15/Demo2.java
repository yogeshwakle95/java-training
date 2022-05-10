import java.io.*;
public class Demo2{
    public static void main(String[] args){
    File directory=new File("C:\\Users\\ITFACT\\Desktop\\java");
    int fileCount=directory.list().length;
    System.out.println("File Count:"+fileCount);

    }
}