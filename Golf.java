// ITP-120 001M FA19
// Assignment 3
// Version 1.0
//   ~~~~~~~~~~~~~~~Names~~~~~~~~~~~~~
//   |*William Sutton* - Trevor Saflin|
//   |Stuart McAlpine - Hassen Shakeel|
//   |Daanish Ahmed - Brian Pourkesali|
//   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//
// Description: This program calculates the scores of a golf game
// Version Changes:
// 1.0 Did the thing
import javax.swing.*; 
import java.util.*;

public class Golf {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		List<String> names = new ArrayList();
		List<String> names2 = new ArrayList();
		String holder = "";
		int[] first, second, combined;
		int leader = 0, size = 0;
		while(size > 40 || size < 1) {
			size = getInt("Please enter in the amount of people:");
         sc.nextLine();
			if(size != 0) {
				first = new int[size];
				second = new int[size];
				for(int i = 0; i < size; i++) {
					System.out.println("--------------Player " + (i + 1) + "------------------");
					holder = getString("Please enter player name:");
					names.add(i, holder);
					first[i] = getInt("Enter in score for the first day");
					second[i] = getInt("Enter in score for the second day");
					sc.nextLine();
				}
				combined = new int[size];
				for(int u = 0; u < size; u++) {
					combined[u] = first[u] + second[u];
				}
				leader = 0;
				for(int w = 0; w < size; w++) {
					if(combined[w] > combined[leader]) {
						leader = w;
					}
				}
				for(int p = 0; p < size; p++) {
					if(combined[p] >= (combined[leader] - 10) && leader != p) {
						names2.add(names.get(p));
					}
				}
				Display(names, names2, first, second, combined, leader, size);
			}
			else {
				System.out.println("Entered 0 players. terminating process");
			}
		}
		
	}
	public static void Display(List<String> names, List<String> names2, int[] first, int[] second, int[] combined, int leader, int size) {
		System.out.println("PlayerID        Day1        Day2        Combined");
		for(int i = 0; i < size; i ++) {
			System.out.println(names.get(i) + "        " + first[i] + "        " + second[i] + "        " + combined[i]);
		}
		System.out.println("____");
		System.out.println("Leader: " + names.get(leader));
		System.out.println("____");
		System.out.println("Players within 10 points");
		for(int q = 0; q < names2.size(); q++) {
			System.out.println(names2.get(q));
		}
		System.out.println("See ya at the 19th hole!");
	}
	public static String getString(String prompt) {
		String q;
		System.out.println(prompt);
		q = sc.nextLine();
		return q;
	}
	public static int getInt(String prompt) {
		int a = 0;
		while(a > 95 || a < 1) {
			System.out.println(prompt);
			a = sc.nextInt();
			if(a > 95 || a < 1) {
				System.out.println("enter valid num");
			}
		}
		return a;
		
	}
}
