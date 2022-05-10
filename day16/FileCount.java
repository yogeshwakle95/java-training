/*WAP to ask user to input folder path and count how many file and folders present in that folder*/
import java.util.*;
import java.io.*;
import java.io.File;
public class FileCount{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file Source code:");
        String folder=sc.nextLine();
        int fileCount=folder.list().length;
        System.out.println("File Count:"+fileCount);


    }
    
}