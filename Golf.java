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

public class Golf { // Program name
   static Scanner sc = new Scanner(System.in); // Scanner
   public static void main(String[] args) // Main method
   {
      // Variable declaration
   
   int numPlayers;
   int count = 0;
   
   ArrayList<String> playerList = new ArrayList<>();

   
   String[] playerNames[] // The first array will store the Player Name and you must use a getter method
                           // to get the Player Name and store it in the Player Name array.
                         
      // The second array will store the score for the first day of the tournament, 
//   int dayOneScore[]       // and you must use a getter method to get the first day score, and store it
                           // in the first day score array. Use a while loop to validate the value of the 
                           // score to make sure that it falls in the range of 0 to 95 inclusive. 
                           
      // The third array will store the score for the second day of the tournament, 
//   int dayTwoScore[]       // and you must use a getter method to get the second day score, and store it 
                           // in the second day score array. Use a while loop to validate the value of the score
                           // to make sure that it falls in the range of 0 to 95 inclusive
                            
      // The fourth array will store the combined score, and you must calculate
//   int combinedScore[]     // the combined score which is the first day score (stored in the first day score array) 
                           // and add it to the second day score (stored in the second day score array) and store
                           // the result in the combined score array. 
 

   // You begin by asking the user how many players for whom they want to enter scores.
   System.out.println("Enter the number of players: ");
   numPlayers = sc.nextInt(); 
   // Validate the response with a while loop to ensure that the value entered is between 0 and 40. (or 200?)
   while (numPlayers != -1 && count <= 200)
   {
      playerList = new int[numPlayers];
      //// polite error message if # players entered is above 200?
   
      // Once you have a valid response, a for loop is entered for processing 4 parallel arrays.
      // The size of each of the parallel arrays is equal to the number of players entered by the user. ***
      for {
         
         }  // End of for loop
         
   }  // End of while loop
         
      
   // If you have at least 1 player, print the contents of the parallel arrays meaning the player name, first day score, and
   // second day score, and combined score for each player, the leader, and anyone within 10 strokes of the leader. End with
   // a message See Ya’ At the 19th Hole as shown.   
   System.out.println("See Ya' At the 19th Hole");
   
   
   } // end of main
} // end of file




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