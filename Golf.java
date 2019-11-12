// ITP-120 001M FA19
// Assignment 3
// Version 2.0
//   ~~~~~~~~~~~~~~~Names~~~~~~~~~~~~~
//   |*William Sutton* - Trevor Saflin|
//   |Stuart McAlpine - Hassen Shakeel|
//   |Daanish Ahmed - Brian Pourkesali|
//   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//
// Description: This program calculates the scores of a golf game
// Version Changes:
// 1.0 Did the thing
// 2.0 Formatting, comments

import javax.swing.*; 
import java.util.*; // Scanner

public class Golf { // Program name
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) { // Main method
		List<String> names = new ArrayList();
		List<String> names2 = new ArrayList();
		String holder = "";
		int[] first, second, combined; // Parallel arrays
		int leader = 0, size = 0;
		while(size > 40 || size < 1) { // While loop, input validation.
			size = getInt("Please enter the number of players: ");
         sc.nextLine();
			if(size != 0) 
			{
				first = new int[size];
				second = new int[size];
				for(int i = 0; i < size; i++) // Get name and scores
				{
					System.out.println("-------------- Player " + (i + 1) + " ------------------");
					holder = getString("Enter player name: ");
					names.add(i, holder);
					first[i] = getInt("Enter first day score: ");
					second[i] = getInt("Enter second day score: ");
					sc.nextLine();
				}
				combined = new int[size]; // Get combined score
				for(int u = 0; u < size; u++) 
				{
					combined[u] = first[u] + second[u];
				}
				leader = 0; // Get leader
				for(int w = 0; w < size; w++) 
					{
					if(combined[w] > combined[leader]) 
						{
							leader = w;
						}
					}
				for(int p = 0; p < size; p++) 
					{
					if(combined[p] >= (combined[leader] - 10) && leader != p) 
						{
							names2.add(names.get(p));
						}
					}
				Display(names, names2, first, second, combined, leader, size); 
			}
			else {
				System.out.println("Entered 0 players. Terminating process"); // Exit if user enters 0 players.
			}
		}
		
	} // Display tournament statistics
	public static void Display(List<String> names, List<String> names2, int[] first, int[] second, int[] combined, int leader, int size) 
	{
		System.out.println("------------- Tournament Statistics --------------");
		System.out.println("__________________________________________________");
		System.out.println("PlayerID        Day1        Day2        Combined");
		for(int i = 0; i < size; i ++) 
		{
			System.out.println(names.get(i) + "	        " + first[i] + "          " + second[i] + "           " + combined[i]);
		}
		System.out.println("__________________________________________________");
		System.out.println("Leader: \n" + names.get(leader));
		System.out.println("__________________________________________________");
		System.out.println("Players within 10 points:");
		for(int q = 0; q < names2.size(); q++) 
			{
			System.out.println(names2.get(q));
			}
		System.out.println("\nSee ya' at the 19th hole!");
	}
	public static String getString(String prompt) 
	{
		String q;
		System.out.println(prompt);
		q = sc.nextLine();
		return q;
	}
	public static int getInt(String prompt) 
	{
		int a = 0;
		while(a > 95 || a < 1) 
		{
			System.out.println(prompt);
			a = sc.nextInt();
			if(a > 95 || a < 1) 
			{
				System.out.println("Enter valid num");
			}
		}
		return a;
		
	}
}