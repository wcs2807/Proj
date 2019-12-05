// ITP-120 001M FA19
// Assignment 4
// Version 1
//   ~~~~~~~~~~~~~~~Names~~~~~~~~~~~~~
//   | William Sutton - Trevor Saflin |
//   |Stuart McAlpine - Hassen Shakeel|
//   |Daanish Ahmed - Brian Pourkesali|
//   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Program name: SalesDemo

import java.util.Scanner;
public class SalesDemo
{
   public static void main(String[] args)
   {
      int totalSold = 0;
      int numberSold;
      int storeID;
      double price;
      double totalSales = 0;
      String runProgram;

      Scanner sc = new Scanner(System.in);

      System.out.println("Time to track daily item sales.");
      System.out.println("Please enter yes to run the program or no to quit.");

      runProgram = sc.nextLine();
      runProgram = runProgram.toLowerCase();

      while (runProgram.equals("yes"))
      {
         System.out.println("Please enter the store that you want to enter sales for (1, 2, or 3):");
         storeID = sc.nextInt();
         System.out.println("Please enter the number of items sold for store " + storeID + ":");
         numberSold = sc.nextInt();
         sc.nextLine();
         System.out.println("Please enter the price for the item for " + storeID + ":");
         price = sc.nextDouble();
         sc.nextLine();

         Sales sale = new Sales(storeID, numberSold, price);

         sale.JustSold(numberSold);
         sale.getSale(price);

         System.out.println("Store: " + sale.getID());
         System.out.println("Sales: " + sale.getNumSold());
         System.out.printf("Price $%5.2f\n", sale.getPrice());
         System.out.printf("Amount owed: $%5.2f\n", sale.getSale(price));
         System.out.println("Total sold for all stores: " + sale.getTotalSold());
         System.out.printf("Total sales for all stores: $%5.2f\n", sale.getTotalSales(price));
         totalSold = sale.getTotalSold();
         totalSales = sale.getTotalSales(price);

         System.out.println("Are you ready to enter sales for another store?");
         System.out.println("Please enter yes to run the program or no to quit.");

         runProgram = sc.nextLine();
         runProgram = runProgram.toLowerCase();
      } // end of while

   System.out.println("Total quantity of items sold for all stores: " + totalSold);
   System.out.printf("Total sales for all stores: $%5.2f\n", totalSales);

   } // end of main

} //end of file