import java.util.Scanner;

class Exercise1
{
   public static void main(String[] args)
   {
      double regPrice = 2.00;
      double overnightPrice = 0.00;

      Scanner keyboard = new Scanner(System.in);

      System.out.print("Enter the item: ");
      String itemName = keyboard.nextLine();

      //System.out.println();

      System.out.print("Enter the price: ");
      double itemPrice = keyboard.nextDouble();

      //System.out.println();

      System.out.print("Overnight delivery (0 == no, 1 == yes): ");
      int overnightCheck = keyboard.nextInt();

      //System.out.println();


      if(overnightCheck >= 0 && overnightCheck <= 1)
      {
         if(overnightCheck == 1)
            overnightPrice = 3.00;
      }

      System.out.println("             Invoice:          \n"+
      "===================================\n");

      System.out.printf(itemName);
      System.out.printf("       %.2f",itemPrice);

      if(itemPrice > 10)
         regPrice = 3.00;

      //System.out.println();

      double totalShip = regPrice+ overnightPrice;

      System.out.printf("\n Shipping        %.2f ",totalShip);

      System.out.println();

      double totalPrice = itemPrice + totalShip;

      //System.out.printf("Total            %.2f",totalPrice);
        System.out.printf("Total       %.2f",totalPrice);

   }
}