/*Write a Program that accepts your name (first name middle name and last name) as command 
line arguments and generate the output as given below.*/
public static void main(String[] args) {
       int[] temp = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
   
       for (int value : temp) {
           System.out.println(value);
       }
   
       for (int i = 0; i < temp.length; i++) {
           temp[i] = (int) Math.pow(temp[i], 2);
       }
   
       for (int value : temp) {
           System.out.println(value);
       }
   }