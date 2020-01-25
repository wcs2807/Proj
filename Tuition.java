// ITP-120
// Description: This program calculates the tuition costs of a GMU student
import java.util.*;
public class Tuition{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
      int degree = 0, credits = 0;
      boolean day = true, repeat = true;
      double tuition = 0, gnsf = 0, erf = 0, total = 0;
      while(repeat){
         String name = "", degreeString = "";
         System.out.println("                Welcome to the GMU Tuition and Fees Calculator");
         displayLogo();
         name = getName();
         degree = getDegree();
         degreeString = getDegreeName(degree);
         credits = getCredits();     
         if(degree == 3 || degree == 6){
            day = getTime();
         }
         tuition = getTuition(degree, day);
         gnsf = getGnsf();
         erf = getErf(credits);
         total = getTotal(tuition, gnsf, erf);
         display(degree, credits, day, tuition, gnsf, erf, total, name, degreeString);
         System.out.println("\n\n\n");
         repeat = getRepeat();
      }
   }
	//Method: displayLogo()
	//Description: Displays the logo of GMU
	//Precondition: N/A
	//Postcondition: N/A
   public static void displayLogo(){
      System.out.println();
   }
	//Method: getRepeat()
	//Description: Asks the user if they want to repeat the program
	//Precondition: N/A
	//Postcondition: returns a  public static boolean
   public static boolean getRepeat(){
      boolean repeat = true, repeatLoop = true;
      String yon = "";//yes or no
      do{
         System.out.println("Please answer yes or no(y/n) if you want to repeat!\n");
         yon = sc.nextLine();
         yon = yon.trim();     
         if(yon.equalsIgnoreCase("y")){
            repeat = true;
            repeatLoop = false;
         }
         else if(yon.equalsIgnoreCase("yes")){
            repeat = true;
            repeatLoop = false;
         }
         else if(yon.equalsIgnoreCase("n")){
            repeat = false;
            repeatLoop = false;
         }
         else if(yon.equalsIgnoreCase("no")){
            repeat = false;
            repeatLoop = false;
         }
         else{
            System.out.println("You didn't enter yes(y) or no(n)");
         }
      }while(repeatLoop);
      sc.nextLine();
      return repeat;
   }
	//Method: getDegreeName(int degree)
	//Description: Gets the degree that the user wants
	//Precondition: recieves a int degree
	//Postcondition: returns a  public static String
   public static String getDegreeName(int degree){
      String degreeS = "";     
      if(degree == 1){
         degreeS = "IU for In State Undergraduate";
      }
      else if(degree == 2){
         degreeS = "IG for In State Graduate";
      }
      else if(degree == 3){
         degreeS = "IL for Law";
      }
      else if(degree == 4){
         degreeS = "OU for Out of State UnderGraduate";
      }
      else if(degree == 5){
         degreeS = "OG for Out of State Undergraduate";
      }
      else{
         degreeS = "OL for Law";
      }
      return degreeS;
   }
	//Method: getName()
	//Description: Gets the user's name
	//Precondition: N/A
	//Postcondition: returns a  public static String
   public static String getName(){
      String name = "";
      do{
         System.out.println("Please enter your name and press enter");
         name = sc.nextLine();
         name = name.trim(); 
         if(name.equals("")){
            System.out.println("Error: Please put in name");
         }
      }while(name.equals(""));   
      return name;
   }
	//Method: display(int de, int cr, boolean day, double tu, double gnsf, double erf, double total, String name, String degreeString)
	//Description: Displays all the data
	//Precondition: recieves a int de, int cr, boolean day, double tu, double gnsf, double erf, double total, String name, String degreeString
	//Postcondition: N/A
   public static void display(int de, int cr, boolean day, double tu, double gnsf, double erf, double total, String name, String degreeString){
      System.out.println("Tuition and fees report for " + name + ":");
      System.out.println("Type of Degree: " + degreeString);    
      if(de == 3 || de == 6){   
         if(day){
            System.out.println("Time of Classes: Day");
         }
         else{
            System.out.println("Time of Classes: Night");
         }
      }
      System.out.println("Tuition: " + String.format("%.2f", tu));
      System.out.println("Graduate New Student Fee: " + String.format("%.2f", gnsf));
      System.out.println("Education Resource Fee: " + String.format("%.2f", erf));
      System.out.println("Number of Credits: " + cr);
      System.out.println("Total Tuition and Fees: " + String.format("%.2f", total));
      System.out.println("Boldly NOVA becomes PATRIOTS BRAVE & BOLD");
      displayLogo();
   }
	//Method: getTotal(double tuition, double gnsf, double erf)
	//Description: Gets the total tuition price by adding everything together
	//Precondition: recieves a double tuition, double gnsf, double erf
	//Postcondition: returns a  public static double
   public static double getTotal(double tuition, double gnsf, double erf){
      double total = 0;
      total = tuition + gnsf + erf;
      return total;
   }
	//Method: getErf(int credits)
	//Description: gets the Erf
	//Precondition: recieves a int credits
	//Postcondition: returns a  public static double
   public static double getErf(int credits){
      double erf = 0;
      if(credits >= 7){
         erf = 100;
      }
      else{
         erf = 60;
      }
      return erf;
   }
	//Method: getGnsf()
	//Description: calculates the GNSF
	//Precondition: N/A
	//Postcondition: returns a  public static double
   public static double getGnsf(){
      double gnsf = 0;
      boolean repeat = true;
      String yon = "";//yes or no
      do{
         System.out.println("Please answer yes or no(y/n) if you are a new student!\n");
         yon = sc.nextLine();
         yon = yon.trim();
         if(yon.equalsIgnoreCase("y")){
            gnsf = 60;
            repeat = false;
         }
         else if(yon.equalsIgnoreCase("yes")){
            gnsf = 60;
            repeat = false;
         }
         else if(yon.equalsIgnoreCase("n")){
            gnsf = 0;
            repeat = false;
         }
         else if(yon.equalsIgnoreCase("no")){
            gnsf = 0;
            repeat = false;
         }
         else{
            System.out.println("You didn't enter yes(y) or no(n)");
         }
      }while(repeat);
      return gnsf;
   }
	//Method: getTime()
	//Description: Gets the time of day a law student will be working
	//Precondition: N/A
	//Postcondition: returns a  public static boolean
   public static boolean getTime(){
      String choice = "a";
      boolean day = true, repeat = true;
      sc.nextLine();
      do{
         System.out.println("Please select day or night by typing in either \"Day\" or \"Night\"");
         choice = sc.nextLine();
         choice = choice.trim();
         if(choice.equalsIgnoreCase("day")){
             day = true;
             repeat = false;
         }
         else if(choice.equalsIgnoreCase("night")){
            day = false;
            repeat = false;
         }
         else{
            System.out.println("Error: Incorrect input");
            repeat = true;
         }
      }while(repeat);
      return day;
   }
	//Method: getTuition(int degree, boolean time)
	//Description: 
	//Precondition: recieves a int degree, boolean time
	//Postcondition: returns a  public static double
   public static double getTuition(int degree, boolean time){
     //3&6
      double tuition = 0;  
      if(degree == 1){
         tuition = 12462;
      }
      else if(degree == 2){
         tuition = 11354;
      }
      else if(degree == 3){    
         if(time){
            tuition = 25354;
         }
         else{
            tuition = 20660;
         }
      }
      else if(degree == 4){
         tuition = 35922;
      }  
      else if(degree == 5){
         tuition = 26794;
      }
      else{     
         if(time){
            tuition = 40740;
         } 
         else{
            tuition = 33298;
         }
      }
      return tuition;
   }
	//Method: getCredits()
	//Description: Asks the user the amount of credits they're taking
	//Precondition: N/A
	//Postcondition: returns a  public static int
   public static int getCredits(){
      int credit = 0;
      String input;
      while(credit < 1 || credit > 25){
         System.out.println("Please input the number of credits you are taking(1 to 25) in numerical form:");
         try{
            credit = sc.nextInt();
            if(credit < 1 || credit > 25){
            credit = 0;
            System.out.println("Please input a number 1 to 25!");
            }
         }
         catch(InputMismatchException e){
            System.out.println("Error: Please input a number 1 to 25 with no decimals and in numerical form!");
            sc.next();
         }
      }
      return credit;
   }
	//Method: getDegree()
	//Description: Asks the user the degree they are taking
	//Precondition: N/A
	//Postcondition: returns a  public static int
   public static int getDegree(){
      int selection = 0;
      String degree = "";
      do{
         System.out.println("Please enter the type of student you are from the choices below:\n" +
         "IU for In State Undergraduate ($12,462)\n" +
         "IG for In State Graduate ($11,354)\n" +
         "IL for Law (Day - $25,354, Evening - $20,660)\n" +
         "OU for Out of State Undergraduate ($35,922)\n" +
         "OG for Out of State Graduate ($26,794)\n" +
         "OL for Law(Day - $40,740, Evening - $33,298\n" +
         "Only enter in the initials of the degree.");
         degree = sc.nextLine();
         degree = degree.trim();
         if(degree.equalsIgnoreCase("IU")){
            selection = 1;
         }
         else if(degree.equalsIgnoreCase("IG")){
            selection = 2;
         }
         else if(degree.equalsIgnoreCase("IL")){
            selection = 3;
         }
         else if(degree.equalsIgnoreCase("OU")){
            selection = 4;
         }
         else if(degree.equalsIgnoreCase("OG")){
            selection = 5;
         }
         else if(degree.equalsIgnoreCase("OL")){
            selection = 6;
         }
         else{
            System.out.println("You did not enter a valid degree. Please try again.");
            sc.nextLine();
         }        
      }while(selection == 0);
      return selection;   
   }
}
