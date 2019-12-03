// ITP-120 001M FA19
// Assignment 4
// Version 0
//   ~~~~~~~~~~~~~~~Names~~~~~~~~~~~~~
//   | William Sutton - Trevor Saflin |
//   |Stuart McAlpine - Hassen Shakeel|
//   |Daanish Ahmed - Brian Pourkesali|
//   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Program name: Sales

public class Sales extends MadeASale
{
   private double price; // Sale price

   public Sales(int newID, int newNumSold, double newPrice)
   {
      // Superclass constructor
      super(newID, newNumSold);

      // Set the price
      price = newPrice;
   }
   
   // getPrice method returns price
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