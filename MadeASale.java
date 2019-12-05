// ITP-120 001M FA19
// Assignment 4
// Version 1
//   ~~~~~~~~~~~~~~~Names~~~~~~~~~~~~~
//   | William Sutton - Trevor Saflin |
//   |Stuart McAlpine - Hassen Shakeel|
//   |Daanish Ahmed - Brian Pourkesali|
//   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Program name: MadeASale

public class MadeASale
{
   private static int totalSold = 0;
   private int numSold;
   private int ID;

   // Default constructor
   public MadeASale()
   {
      numSold = 0;
      ID = 0;
   }

   // MadeASale constructor
   public MadeASale(int newID, int newNumSold)
   {
      numSold = newNumSold;
      ID = newID;
   }

   public int getID()
   {
      return ID;
   }

   public void setID(int newID)
   {
      ID = newID;
   }

   public int getNumSold()
   {
      return numSold;
   }

   public int getTotalSold()
   {
      return totalSold;
   }

   public void JustSold(int numSold)
   {
      totalSold = totalSold + numSold;
   }

} //End of MadeASale



 