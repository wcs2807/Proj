// ITP-120 001M FA19
// Assignment 3
// Version 0.1
//
//   ~~~~~~~~~~~~~~~Names~~~~~~~~~~~~~
//   |*William Sutton* - Trevor Saflin|
//   |Stuart McAlpine - Hassen Shakeel|
//   |Daanish Ahmed - Brian Pourkesali|
//   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//
// Description: Score tracker for Masters Golf Tournament
// Version Changes:
//

import javax.swing.*; // GUI
import java.util.*; // Scanner and utilities

public class Golf // Program name
{                 
   static Scanner sc = new Scanner(System.in); // Scanner
   public static void main(String[] args) // Main method
   {
   
   int size = 0;   
   String[][] play;
   while (size < 1)
      {
         size = getInt("pleaase enter int");
         play = new String[size][size];
         System.out.println("length is " + play.length); // print array size

      } // end while loop
   
   
   // Once you have a valid response, a for loop is entered for
   // processing 4 parallel arrays.
  
   
   
   for (int i = 0; i < size; i++)
		   {
	   
			   play[i] = sc.nextLine();
   		
		   } // end for loop
   
   } // end of main
   public static int getInt(String prompt) {
	   int b = 0;
	   System.out.println(prompt);
	   b = sc.nextInt();
	   return b;
   }
   public static String getString(String prompt) {
	   String a = "";
	   System.out.println(prompt);
	   a = sc.nextString();
	   return a;
   }

} // end of file













   // Get scores

// import java.util.*;

// public class expl{
//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args){
//       int size = sc.nextInt();
//       int[][] play = new int[size][size];
//    }
// }
//



// --------------------- 

// // // Ch.7 Slide #30 - Finding the Highest Value in an array
// int [] numbers = new int[50];
// int highest = numbers[0];
// for (int i = 1; i < numbers.length; i++)
// {
//	if (numbers[i] > highest)
//		highest = numbers[i];
// }


// // // Ch.7 Slide #30 - Finding lowest value
// int lowest = numbers[0];
// for (int i = 1; i < numbers.length; i++)
// {
//	if (numbers[i] < lowest)
//		lowest = numbers[i];
// }

// **** Ch.7 Slide #50 - Printing scores array




// import java.util.*;

// public class expl{
//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args){
//       int size = sc.nextInt();
//       int[][] play = new int[size][size];
//    }
// }
//



// --------------------- 

// // // Ch.7 Slide #30 - Finding the Highest Value in an array
// int [] numbers = new int[50];
// int highest = numbers[0];
// for (int i = 1; i < numbers.length; i++)
// {
//	if (numbers[i] > highest)
//		highest = numbers[i];
// }


// // // Ch.7 Slide #30 - Finding lowest value
// int lowest = numbers[0];
// for (int i = 1; i < numbers.length; i++)
// {
//	if (numbers[i] < lowest)
//		lowest = numbers[i];
// }

// **** Ch.7 Slide #50 - Printing scores array