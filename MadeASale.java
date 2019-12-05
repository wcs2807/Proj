// ITP-120 001M FA19
// Assignment 4
// Version 2
//   ~~~~~~~~~~~~~~~Names~~~~~~~~~~~~~
//   | William Sutton - Trevor Saflin |
//   |Stuart McAlpine - Hassen Shakeel|
//   |Daanish Ahmed - Brian Pourkesali|
//   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Program name: MadeASale

public class MadeASale // Class name
{
   private static int totalSold = 0;
   private int numSold;
   private int ID;

   // Default constructor sets the quantity of items sold 
   // for a single store to 0 and sets the Store ID to 0.
   public MadeASale()
   {
      numSold = 0;
      ID = 0;
   }

   // MadeASale constructor accepts 2 parameters for
   // quantity of items sold and Store ID 
   public MadeASale(int newID, int newNumSold)
   {
      numSold = newNumSold;
      ID = newID;
   }
   
   // accessor method (getter method) that gets the Store ID 
   public int getID()
   {
      return ID;
   }
   
   // an accessor method (getter method) that gets the quantity
   // of items sold for a store 
   public void setID(int newID)
   {
      ID = newID;
   }
   
   // mutator method (setter method) that sets the Store ID 
   public int getNumSold()
   {
      return numSold;
   }
   
   // mutator method (setter method) that sets the
   // quantity of items sold for a single Store 
   public int getTotalSold()
   {
      return totalSold;
   }

   // a method that sums the total quantity of items sold for all stores 
   public void JustSold(int numSold)
   {
      totalSold = totalSold + numSold;
   }

} //End of MadeASale
 