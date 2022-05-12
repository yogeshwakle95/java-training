/*Write a Program that take 5 numbers into array and print square value of each number*/
import java.util.*;
public class Square {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        System.out.println("\n Square of elements are:  ");
        for(int elements: arr){

            System.out.println(elements*elements);

        }
        }
        }
     