// ITP-120 001M FA19
// Assignment 4
// Version 2
//   ~~~~~~~~~~~~~~~Names~~~~~~~~~~~~~
//   | William Sutton - Trevor Saflin |
//   |Stuart McAlpine - Hassen Shakeel|
//   |Daanish Ahmed - Brian Pourkesali|
//   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Program name: MadeASaleDemo

import java.util.Scanner; // Scanner
public class MadeASaleDemo // Class name
{
   public static void main(String[] args) // Main method
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

      // While loop accepts input until user exits loop
      // Prints totals upon exit
      while (runProgram.equals("yes")) 
      {
         //  prompt to enter the Store ID and input accordingly 
         System.out.println("Please enter the store that you want to enter sales for (1, 2, or 3): ");
         storeID = sc.nextInt();
         // prompt to enter the quantity of items sold for the store and input accordingly 
         System.out.println("Please enter the number of items sold for store " + storeID + ":");
         numberSold = sc.nextInt();
         sc.nextLine();
         
         // Object to represent a sale - passes the Store ID and quantity of items
         // sold as arguments to the constructor in the MadeASale class  
         MadeASale sale = new MadeASale(storeID, numberSold);
         // For the object created, run the method that adds the quantity
         // of items sold to the total quantity of items sold for all stores
         sale.JustSold(numberSold);
         
         // for the object created, display the Store ID. 
         System.out.println("Store: " + sale.getID());
         // for the object created, display the quantity of items sold
         System.out.println("Quantity sold: " +  sale.getNumSold());
         // for the object created, display the total quantity
         // of items sold for all stores at that point
         System.out.println("Total quantity of items sold for all stores: " + sale.getTotalSold() + "\n");
         // Save the total quantity of items sold for all stores in a variable
         // for displaying after the program ends
         totalSold = sale.getTotalSold();
     
         // Prompt the user to run the program again and accept input accordingly
         System.out.println("Are you ready to enter sales for another store?");
         System.out.println("Please enter yes to run the program or no to quit.");
         runProgram = sc.nextLine();
         runProgram = runProgram.toLowerCase();
         
      } //end while

      // When the program has ended, display the total quantity of items sold for all stores
      System.out.println("Total quantity of items sold for all stores: " + totalSold + "\n");

   } // end main

} // end of program