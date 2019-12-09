// ITP-120 001M FA19
// Assignment 4
// Version 2.1
//   ~~~~~~~~~~~~~~~Names~~~~~~~~~~~~~
//   | William Sutton - Trevor Saflin |
//   |Stuart McAlpine - Hassen Shakeel|
//   |Daanish Ahmed - Brian Pourkesali|
//   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Program name: SalesDemo

import java.util.Scanner; // Scanner
public class SalesDemo // Class name
{
   public static void main(String[] args) // Main method
   {
      int totalSold = 0;
      int numberSold = 0;
      int storeID = 0;
      double price = 0;
      double totalSales = 0;
      String runProgram = " ", holder = " ";

      Scanner sc = new Scanner(System.in); 

      System.out.println("Time to track daily item sales.");
      while(runProgram == " "){
        System.out.println("Please enter yes to run the program or no to quit.");
        holder = sc.nextLine();
        if(holder.equals("yes"))
            runProgram = "yes";
        else if(holder.equals("no"))
            runProgram = "no";         
        runProgram = runProgram.toLowerCase();
      }
      // Loop the runs the program by allowing the user to choose
      // to run the program or not 
      while (runProgram.equals("yes"))
      {
         // Prompt to enter the store number and input accordingly
         while(storeID < 1 && storeID > 3){
            System.out.println("Please enter the store that you want to enter sales for (1, 2, or 3):");
            storeID = sc.nextInt();
         }
         // Prompt to enter the quantity of items sold for the store and input accordingly 
         while(numberSold < 1){
            System.out.println("Please enter the number of items sold for store " + storeID + ":");
            numberSold = sc.nextInt();
            sc.nextLine();
         }
         // Prompt to enter the price of the item sold for the store and input accordingly 
         while(price < 1){  
             System.out.println("Please enter the price for the item for " + storeID + ":");
             price = sc.nextDouble();
             sc.nextLine();
         }
         // An object that represents a sale and passes the
         // store ID and quantity of items sold and price as
         // arguments to the constructor in the Sales class
         Sales sale = new Sales(storeID, numberSold, price);

         // For the object created, run the method that adds the quantity
         // sold to the total quantity of items sold for all stores 
         sale.JustSold(numberSold);
         // For the object created, run the method that gets the price 
         sale.getSale(price);

         // For the object created, display the store ID. 
         System.out.println("Store: " + sale.getID());
         // For the object created, display the quantity of items sold.
         System.out.println("Sales: " + sale.getNumSold());
         // For the object created, display the price of the items sold.
         System.out.printf("Price $%5.2f\n", sale.getPrice());
         // For the object created, display the amount owed. 
         System.out.printf("Amount owed: $%5.2f\n", sale.getSale(price));
         // For the object created, display the total quantity of items sold for all stores
         System.out.println("Total sold for all stores: " + sale.getTotalSold());
         // For the object created, display the total sales for all stores
         System.out.printf("Total sales for all stores: $%5.2f\n", sale.getTotalSales(price));
         // Save the total quantity of items sold for all stores in a variable
         totalSold = sale.getTotalSold();
         // Save the total sales for all stores at that point in a variable
         totalSales = sale.getTotalSales(price);

         // Prompt the user to run the program again and accept input accordingly 
         runProgram = " ";
         System.out.println("Are you ready to enter sales for another store?");
         System.out.println("Please enter yes to run the program or no to quit.");
          while(runProgram == " "){
             System.out.println("Please enter yes to run the program or no to quit.");
             holder = sc.nextLine();
             if(holder.equals("yes"))
                  runProgram = "yes";
              else if(holder.equals("no"))
                  runProgram = "no";         
           runProgram = runProgram.toLowerCase();
          }
          runProgram = " ";
      } // end of while
   
   // When the program has ended, display the total quantity
   // of items sold for all stores and total sales for all stores
   System.out.println("Total quantity of items sold for all stores: " + totalSold);
   System.out.printf("Total sales for all stores: $%5.2f\n", totalSales);

   } // end of main

} //end of file