// ITP-120 001M FA19
// Assignment 2
// Version 1.0
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
//
//
//
import java.util.*;
public class Scores{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
      //Vars
      String name1, name2;
      int[] quarters = new int[4];
      int[] seconds = new int[48];
      int holder = 0, holder2 = 0, score1 = 0, score2 = 0, shotNum = 0;
      String placeHolder = "";
      
      //end Vars
      do{
         name1 = getString("Please input the name of the first player(within 8 characters):");
         if(name1.length() > 8){
            System.out.println("You name has too many characters. Please put less than 8");
         }
      }while(name1.length() > 8);
      do{
         name2 = getString("Please input the name of the second player(within 8 characters):");
         if(name2.length() > 8){
            System.out.println("You name has too many characters. Please put less than 8");
         }
      }while(name2.length() > 8);
      for(int s = 0; s < (quarters.length); s++){
         
         for(int x = 0; x < (seconds.length); x++){
            if(x == 0){
               System.out.println("*******************************************Quarter " + (s + 1) + "*******************************************");
               System.out.print("Shot#");
               returnSpaces(4);
               placeHolder = name1 + " shot";
               System.out.print(placeHolder);
               returnSpaces(21 - placeHolder.length());
               placeHolder = name1 + " score";
               System.out.print(placeHolder);
               returnSpaces(20 - placeHolder.length());
               placeHolder = "* " + name2 + " shot";
               System.out.print(placeHolder);
               returnSpaces(23 - placeHolder.length());
               System.out.print(name2 + " score");
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
      compare(name1, name2, score1, score2, " won it!");
      
   }
   public static void returnSpaces(int num){
      for(int a = 0; a <= num; a++){
         System.out.print(" ");
      }
   }
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
   public static void displayNums2(String name1, int score1, int holder, int shotNum){
      System.out.println("|" + " " + displayShot(holder) + score1);
   }
   public static void compare(String name1, String name2, int score1, int score2, String prompt){
      if(score1 > score2){
         System.out.println(name1 + prompt);
      }
      else if(score1 < score2){
         System.out.println(name2 + prompt);
      }
      else{
         System.out.println("\nNeither" + prompt + " It was a tie game!");
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
   public static int generateShot(){
      return (int)(Math.random() * 4);
   }
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