// ITP-120 001M FA19
// Assignment 2
// Version 1.1
//   ~~~~~~~~~~~~~~~Names~~~~~~~~~~~~~
//   |*William Sutton* - Trevor Saflin|
//   |Stuart McAlpine - Hassen Shakeel|
//   |Daanish Ahmed - Brian Pourkesali|
//   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//
// Description: This program calculates the scores of a basketball game
// Version Changes:
// 1.0 Fixed formatting error with shotNum being < 10 and score > 9 that would result in an extra space being added between the score and the "|"
//	Added "smart formatting" to line below the quarter marker
// 1.1 Minor formatting issues and fixes to make program more like the assignment example
// 1.1.1 spiced up victory strings
//
import java.util.*;
public class Scores{
   static final Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
      //Vars
      String name1, name2;
      int[] quarters = new int[4];
      int[] seconds = new int[48];
      int holder = 0, holder2 = 0, score1 = 0, score2 = 0, shotNum = 0;
      String placeHolder = "";
      
      //end Vars
      System.out.println("Welcome to the basketball points simulator!\nThe player with the most points wins. Good Luck!");
      do{
         name1 = getString("Please input the name of the first player(within 12 characters):"); 
         if(name1.length() > 12){
            System.out.println("You name has too many characters. Please put less than 13 characters");
         }
      }while(name1.length() > 12);
      do{
         name2 = getString("Please input the name of the second player(within 12 characters):"); 
         if(name2.length() > 12){
            System.out.println("You name has too many characters. Please put less than 13 characters");
         }
      }while(name2.length() > 12);
      for(int s = 0; s < (quarters.length); s++){
         
         for(int x = 0; x < (seconds.length); x++){          
            if(x == 0){
               System.out.println("*******************************************QUARTER " + (s + 1) + "*******************************************");
               System.out.print("Shot#");
               returnSpaces(4);
               placeHolder = name1 + " Shot";
               System.out.print(placeHolder);
               returnSpaces(21 - placeHolder.length());
               placeHolder = name1 + " Score";
               System.out.print(placeHolder);
               returnSpaces(20 - placeHolder.length());
               placeHolder = "* " + name2 + " Shot";//name2 begins
               System.out.print(placeHolder);
               returnSpaces(23 - placeHolder.length());
               System.out.print(name2 + " Score");
               System.out.println();
            }         
            if(x % 2 == 0){
               holder = generateShot();
               score1 += holder;
               shotNum++;
            }
            else{
               holder2 = generateShot();
               score2 += holder2;
               displayNums1(name1 ,score1, holder, shotNum);
               displayNums2(name2, score2, holder2, shotNum);  
            }
            
         }
      }
      compare(name1, name2, score1, score2, " won it! They won the Game! Incredible!");
      
   }
	//Method: returnSpaces(int num)
	//Description: prints spaces
	//Precondition: recieves a int num
	//Postcondition: N/A
   public static void returnSpaces(int num){
      for(int a = 0; a <= num; a++){
         System.out.print(" ");
      }
   }
	//Method: displayNums1(String name1, int score1, int holder, int shotNum)
	//Description: displays the shot number, type, and score
	//Precondition: recieves a String name1, int score1, int holder, int shotNum
	//Postcondition: N/A
   public static void displayNums1(String name1, int score1, int holder, int shotNum){
      System.out.print(shotNum);  
      if(shotNum < 10){
         System.out.print("         ");
         System.out.print(displayShot(holder));     
         if(score1 < 10) {
        	 System.out.print(score1 + "                    ");//20
         }
         else {
        	 System.out.print(score1 + "                   ");
         }
      }
      else{
         System.out.print("        ");
         System.out.print(displayShot(holder));    
         if(score1 < 100){       
            if(score1 < 10){
               System.out.print(score1 + "                    ");
            }
            else {
            	System.out.print(score1 + "                   ");
            }
         }
         else{
         System.out.print(score1 + "                  ");
         }
         
      }
   }
	//Method: displayNums2(String name1, int score1, int holder, int shotNum)
	//Description: displays the shot number, type, and score
	//Precondition: recieves a String name1, int score1, int holder, int shotNum
	//Postcondition: N/A
   public static void displayNums2(String name1, int score1, int holder, int shotNum){
      System.out.println("|" + " " + displayShot(holder) + score1);
   }
	//Method: compare(String name1, String name2, int score1, int score2, String prompt)
	//Description: compares scores
	//Precondition: recieves a String name1, String name2, int score1, int score2, String prompt
	//Postcondition: N/A
   public static void compare(String name1, String name2, int score1, int score2, String prompt){
      if(score1 > score2){
         System.out.println(name1 + prompt);
      }
      else if(score1 < score2){
         System.out.println(name2 + prompt);
      }
      else{
         System.out.println("Tie game..Go Home..See ya' later!");
      }
   }
   public static String displayShot(int num){//15 spaces

      if(num == 0){
         return "Airball               ";
      }

      else if(num == 1){
         return "Foul Ball             ";
      }

      else if(num == 2){
         return "Two Points!           ";
      }
      else{
         return "Three Pointer!        ";
      }
   }
	//Method: generateShot()
	//Description: generates a random shot number
	//Precondition: N/A
	//Postcondition: returns a  public static int
   public static int generateShot(){
      return (int)(Math.random() * 4);
   }
	//Method: getString(String prompt)
	//Description: returns a string
	//Precondition: recieves a String prompt
	//Postcondition: returns a  public static String
   public static String getString(String prompt){
      String input = "";
   
      while(input.equals("")){
         System.out.println(prompt);
         input = sc.nextLine();
         input = input.trim();
    
         if(input.equals("")){
            System.out.println("Please enter in a string");
         }
      }
      return input;
   }
}
