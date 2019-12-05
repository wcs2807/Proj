// ITP-120 001M FA19
// Assignment 4
// Version 2
//   ~~~~~~~~~~~~~~~Names~~~~~~~~~~~~~
//   | William Sutton - Trevor Saflin |
//   |Stuart McAlpine - Hassen Shakeel|
//   |Daanish Ahmed - Brian Pourkesali|
//   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Program name: Sales

public class Sales extends MadeASale // Class
{
   private double price; // Data member for sale price


   // Constructor that accepts 3 parameters for the quantity
   // of items sold and store ID and the price.
   public Sales(int newID, int newNumSold, double newPrice)
   {
      // Superclass constructor passes 2 parameters
      // for the store ID and the quantity of items sold
      super(newID, newNumSold);

      // Set the price
      price = newPrice;
   }
   
   // Accessor/getter method to get the price of the items sold 
   public double getPrice()
   {
      return price;
   }

   // getSale calculates and returns total price
   // which is quantity sold * price
   public double getSale(double price)
   {
      return getNumSold() * price;

   }

   // getTotalSold calculates and returns the total price
   // for quantity sold * price
   public double getTotalSales(double price)
   {
      return getTotalSold() * price;
   }
   
} // end of class