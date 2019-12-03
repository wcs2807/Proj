// ITP-120 001M FA19
// Assignment 4
// Version 0
//   ~~~~~~~~~~~~~~~Names~~~~~~~~~~~~~
//   | William Sutton - Trevor Saflin |
//   |Stuart McAlpine - Hassen Shakeel|
//   |Daanish Ahmed - Brian Pourkesali|
//   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Program name: MadeASaleDemo

import java.util.Scanner;
public class MadeASaleDemo
{
   public static void main(String[] args)
   {
      String runProgram = " ";
      int storeID = 0;
      int numberSold = 0;
      int totalSold = 0;
      Scanner sc = new Scanner(System.in);

      System.out.println("Time to track daily item sales.");
      System.out.println("Please enter yes to run the program or no to quit.");

      runProgram = sc.nextLine();
      runProgram = runProgram.toLowerCase();

      while (runProgram.equals("yes"))
      {
         System.out.println("Please enter the store that you want to enter sales for (1, 2, or 3): ");
         storeID = sc.nextInt();
         System.out.println("Please enter the number of items sold for store " + storeID + ":");
         numberSold = sc.nextInt();
         sc.nextLine();

         MadeASale sale = new MadeASale(storeID, numberSold);
         sale.JustSold(numberSold);

         System.out.println("Store: " + sale.getID());
         System.out.println("Quantity sold: " +  sale.getNumSold());
         System.out.println("Total quantity of items sold for all stores: " + sale.getTotalSold() + "\n");
         totalSold = sale.getTotalSold();
     
         System.out.println("Are you ready to enter sales for another store?");
         System.out.println("Please enter yes to run the program or no to quit.");
         runProgram = sc.nextLine();
         runProgram = runProgram.toLowerCase();
         
      } //end while

      System.out.println("Total quantity of items sold for all stores: " + totalSold + "\n");

   } // end main

} // end of program